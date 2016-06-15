package com.mibac.lifesimulator.containers;

import java.util.List;

import com.mibac.lifesimulator.entities.IEntity;

public class Container<T extends IEntity> implements IContainer<T> {
    protected List<T> entities;

    public Container(List<T> entities) {
        if (entities == null)
            throw new IllegalArgumentException("Entity list is null");
        this.entities = entities;
    }

    @Override
    public List<T> getEntities() {
        return entities;
    }

    @Override
    public void setEntities(List<T> entities) {
        this.entities = entities;
    }

    @Override
    public void addEntity(T entity) {
        entities.add(entity);
    }

    @Override
    public boolean removeEntity(T entity) {
        return entities.remove(entity);
    }

    @Override
    public T removeEntity(int index) {
        return entities.remove(index);
    }
}
