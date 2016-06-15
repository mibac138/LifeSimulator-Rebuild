package com.mibac.lifesimulator.controllers;

import com.mibac.lifesimulator.entities.IEntity;

public interface IController<T extends IEntity> {
    void update(double delta);

    void addEntity(T entity);

    boolean removeEntity(T entity);
}
