package com.mibac.lifesimulator.entities;

import com.mibac.lifesimulator.utils.Position;

public interface IEntity {
    /**
     * Returns entity's position
     *
     * @return entity's position
     */
    Position getPosition();

    /**
     * Sets entity's position to the specified one
     *
     * @param position - position which you want the entity to be at
     */
    void setPosition(Position position);
}
