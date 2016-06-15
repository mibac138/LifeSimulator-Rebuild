package com.mibac.lifesimulator.containers;

import java.util.List;

import com.mibac.lifesimulator.entities.IEntity;

public interface IContainer {
    List<IEntity> getEntities();

    void setEntities(List<IEntity> entities);

    void addEntity(IEntity entity);
}
