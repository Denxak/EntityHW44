package ait.entitycollections.interfaces;

import java.util.*;

public class EntityCollectionBImpl implements EntityCollection {
    private static Comparator<Entity> comparator = (e1, e2) -> Integer.compare(e1.getValue(), e2.getValue());
    private TreeSet<Entity> entities = new TreeSet<>(comparator);

    //O(log n)
    @Override
    public void add(Entity entity) {
        if (entity == null) {
            throw new RuntimeException("Entity is null");
        }
        entities.add(entity);
    }

    //O(log n)
    @Override
    public Entity removeMaxValue() {
        return entities.pollLast();
    }
}
