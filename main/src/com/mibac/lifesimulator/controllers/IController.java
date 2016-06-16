package com.mibac.lifesimulator.controllers;

import java.util.List;

import com.mibac.lifesimulator.containers.IContainer;
import com.mibac.lifesimulator.entities.IEntity;
import com.mibac.lifesimulator.view.ContainerView;

public interface IController<T extends IEntity> {
    /**
     * Updates {@link IEntity entities}, {@link IContainer container} and {@link ContainerView view}
     *
     * @param delta - time between last update and this update. Used for calculations.
     */
    void update(double delta);

    /**
     * Adds the specified entity to {@link IContainer container}
     *
     * @param entity - entity which you want to add
     */
    void addEntity(T entity);

    /**
     * Removes the specified entity from {@link IContainer container}
     *
     * @param entity
     * @return {@link List#remove(Object)}
     */
    boolean removeEntity(T entity);
}
