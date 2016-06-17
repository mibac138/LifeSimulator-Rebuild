package com.mibac.lifesimulator.view;

import com.mibac.lifesimulator.entities.IEntity;
import com.mibac.lifesimulator.utils.Position;

public class MoveableContainerView<T extends IEntity> extends ContainerView<T> {
    private static final long serialVersionUID = 2L;
    protected int offsetX;
    protected int offsetY;

    public Position screenToView(Position position) {
        position.x -= offsetX;
        position.y -= offsetY;
        return position;
    }
}
