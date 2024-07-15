package ait.entitycollections.interfaces;

import java.util.*;

public class EntityCollectionAImpl implements EntityCollection {
    private Map<Integer, Entity> entities = new HashMap<>();

    // O(1)
    @Override
    public void add(Entity entity) {
        if (entity == null) {
            throw new RuntimeException("Entity is null");
        }
        entities.putIfAbsent(entity.getValue(), entity);
    }

    //O(n)
    @Override
    public Entity removeMaxValue() {
        Entity maxEntity = null;
        for (Entity entity : entities.values()) {
            if (maxEntity == null || entity.getValue() > maxEntity.getValue()) {
                maxEntity = entity;
            }
        }
        if (maxEntity != null) {
            entities.remove(maxEntity.getValue());
        }
        return maxEntity;
    }
}
