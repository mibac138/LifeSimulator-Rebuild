package com.mibac.lifesimulator.containers;

import java.util.ArrayList;
import java.util.List;

import com.mibac.lifesimulator.entities.IEntity;

public class BasicContainer extends AbstractContainer {
    public BasicContainer() {
        this(new ArrayList<>());
    }

    public BasicContainer(List<IEntity> entities) {
        super(entities);
    }

    @Override
    public List<IEntity> getEntities() {
        return entities;
    }

    @Override
    public void setEntities(List<IEntity> entities) {
        this.entities = entities;
    }

    @Override
    public void addEntity(IEntity entity) {
        entities.add(entity);
    }
}
