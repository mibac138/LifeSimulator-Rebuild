package com.mibac.lifesimulator.entities;

import com.mibac.lifesimulator.utils.Position;

public class BasicEntity implements IEntity {
    protected Position position;

    public BasicEntity() {
        position = new Position();
    }

    public BasicEntity(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }
}
