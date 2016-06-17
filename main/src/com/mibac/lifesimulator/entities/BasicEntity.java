package com.mibac.lifesimulator.entities;

import java.util.List;

import com.mibac.lifesimulator.utils.DistanceComparator;
import com.mibac.lifesimulator.utils.Position;

public class BasicEntity extends Entity {
    protected Position target;
    protected double speed;

    public BasicEntity() {
        this.speed = 7.25;
    }

    public void update(List<? extends IEntity> entities) {
        if (entities.size() <= 1)
            return;

        entities.sort(new DistanceComparator.EntityComparator(this));
        entities.remove(0); // remove itself

        setTarget(entities.get(0).getPosition());
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
