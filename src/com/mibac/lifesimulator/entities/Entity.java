package com.mibac.lifesimulator.entities;

import com.mibac.lifesimulator.utils.Position;

/**
 * Most basic of {@link IEntity} implementations
 * 
 * @author mibac138
 *
 */
public class Entity implements IEntity {
    protected Position position;

    public Entity() {
        position = new Position();
    }

    public Entity(Position position) {
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
