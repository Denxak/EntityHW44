package ait.entitycollections.interfaces;

import java.util.*;

public class EntityCollectionCImpl implements EntityCollection {
    private List<Entity> entities = new LinkedList<>();
    private static Comparator<Entity> comparator = (e1, e2) -> Integer.compare(e1.getValue(), e2.getValue());

    // O(log n)
    @Override
    public void add(Entity entity) {
        if (entity == null) {
            throw new RuntimeException("Entity is null");
        }
        int index = Collections.binarySearch(entities, entity, comparator);
        if (index < 0) {
            entities.add(-index - 1, entity);
        }
    }

    // O(1)
    @Override
    public Entity removeMaxValue() {
        return entities.removeLast();
    }
}
