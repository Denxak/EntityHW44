package ait.entitycollections.interfaces;

public interface EntityCollection {
    public void add(Entity entity);

    public Entity removeMaxValue();
}
