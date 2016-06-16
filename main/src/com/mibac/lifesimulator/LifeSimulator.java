package com.mibac.lifesimulator;

import java.util.ArrayList;

import com.mibac.lifesimulator.containers.Container;
import com.mibac.lifesimulator.controllers.BasicController;
import com.mibac.lifesimulator.controllers.Controller;
import com.mibac.lifesimulator.entities.BasicEntity;
import com.mibac.lifesimulator.entities.Entity;
import com.mibac.lifesimulator.entities.IEntity;
import com.mibac.lifesimulator.utils.Position;
import com.mibac.lifesimulator.view.BasicContainerView;
import com.mibac.lifesimulator.view.ContainerView;

public final class LifeSimulator {

    public static void main(String... args) {
        new LifeSimulator();
    }

    private LifeSimulator() {
        basicGameLoop();
    }

    @SuppressWarnings("unused")
    private void basicGameLoop() {
        BasicController controller =
                new BasicController(new Container<>(new ArrayList<>()), new BasicContainerView());

        BasicEntity entity = new BasicEntity();
        entity.setPosition(new Position(250, 250));
        entity.setTarget(new Position(275, 300));

        controller.addEntity(entity);

        double currentTime = System.nanoTime();
        double lastTime = currentTime;
        while (true) {
            currentTime = System.nanoTime();
            controller.update((currentTime - lastTime) / 1E9);
            lastTime = currentTime;
        }
    }

    @SuppressWarnings("unused")
    private void mainGameLoop() {
        ContainerView<IEntity> view = new ContainerView<>();
        Controller<IEntity> controller =
                new Controller<>(new Container<>(new ArrayList<IEntity>()), view);

        controller.addEntity(new Entity(new Position(250, 250)));

        double currentTime = System.nanoTime();
        double lastTime = currentTime;
        while (true) {
            currentTime = System.nanoTime();
            controller.update((currentTime - lastTime) / 1E9);
            lastTime = currentTime;
        }
    }
}
