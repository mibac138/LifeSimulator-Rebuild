package com.mibac.lifesimulator.entities;

import com.mibac.lifesimulator.utils.Position;

public class BasicEntity extends Entity {
    protected Position target;
    protected double speed;

    public BasicEntity() {
        this.speed = 7.25;
    }

    public Position getTarget() {
        return target;
    }

    public void setTarget(Position target) {
        this.target = target;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
