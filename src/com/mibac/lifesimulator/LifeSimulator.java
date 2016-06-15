package com.mibac.lifesimulator;

import com.mibac.lifesimulator.containers.BasicContainer;
import com.mibac.lifesimulator.controllers.BasicController;
import com.mibac.lifesimulator.entities.BasicEntity;
import com.mibac.lifesimulator.utils.Position;
import com.mibac.lifesimulator.view.AbstractContainerView;
import com.mibac.lifesimulator.view.BasicContainerView;

public final class LifeSimulator {

    public static void main(String... args) {
        new LifeSimulator();
    }

    private LifeSimulator() {
        AbstractContainerView view = new BasicContainerView();
        BasicController controller = new BasicController(new BasicContainer(), view);

        controller.getContainer().addEntity(new BasicEntity(new Position(250, 250)));

        while (true)
            controller.update();
    }
}
