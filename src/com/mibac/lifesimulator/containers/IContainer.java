package com.mibac.lifesimulator.containers;

import java.util.List;

import com.mibac.lifesimulator.entities.IEntity;

public interface IContainer<T extends IEntity> {
    /**
     * Represents list of all currently playing entities
     *
     * @return all currently playing entities
     */
    List<T> getEntities();

    /**
     * Replaces list of entities with the provided one
     *
     * @param entities - replacement for previous entities
     */
    void setEntities(List<T> entities);

    /**
     * Adds entity to the {@link #getEntities() list}
     *
     * @param entity - entity which you want to add
     */
    void addEntity(T entity);

    /**
     * Removes entity from the {@link #getEntities() list}
     *
     * @param entity - entity to remove
     * @return {@link List#remove(Object)}
     */
    boolean removeEntity(T entity);

    /**
     *
     * @param index - index of entity from the {@link #getEntities() list}
     * @return {@link List#remove(int)}
     */
    T removeEntity(int index);
}
