package com.mibac.lifesimulator.containers;

import java.util.List;

import com.mibac.lifesimulator.entities.IEntity;

public interface IContainer<T extends IEntity> {
    List<T> getEntities();

    void setEntities(List<T> entities);

    void addEntity(T entity);

    boolean removeEntity(T entity);

    T removeEntity(int index);
}
