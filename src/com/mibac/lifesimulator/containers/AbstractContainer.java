package com.mibac.lifesimulator.containers;

import java.util.List;

import com.mibac.lifesimulator.entities.IEntity;

public abstract class AbstractContainer implements IContainer {
    protected List<IEntity> entities;

    protected AbstractContainer(List<IEntity> entities) {
        if (entities == null)
            throw new IllegalArgumentException("Entity list is null");
        this.entities = entities;
    }
}
