package com.mibac.lifesimulator.entities;

import com.mibac.lifesimulator.utils.Position;

public interface IEntity {
    Position getPosition();

    void setPosition(Position position);
}
