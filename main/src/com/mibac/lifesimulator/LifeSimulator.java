package com.mibac.lifesimulator;

import java.util.ArrayList;

import com.mibac.lifesimulator.containers.Container;
import com.mibac.lifesimulator.controllers.BasicController;
import com.mibac.lifesimulator.controllers.Controller;
import com.mibac.lifesimulator.controllers.IController;
import com.mibac.lifesimulator.entities.BasicEntity;
import com.mibac.lifesimulator.entities.Entity;
import com.mibac.lifesimulator.entities.IEntity;
import com.mibac.lifesimulator.utils.Position;
import com.mibac.lifesimulator.view.BasicContainerView;
import com.mibac.lifesimulator.view.ContainerView;

public final class LifeSimulator {
    public static final double FPS = 60;

    public static void main(String... args) {
        new LifeSimulator();
    }

    private LifeSimulator() {
        basicGameLoop();
    }

    private void basicGameLoop() {
        ContainerView<BasicEntity> view = new BasicContainerView();
        BasicController controller = new BasicController(new Container<>(new ArrayList<>()), view);

        BasicEntity entity1 = new BasicEntity();
        entity1.setPosition(new Position(250, 250));

        BasicEntity entity2 = new BasicEntity();
        entity2.setPosition(new Position(300, 250));

        BasicEntity entity3 = new BasicEntity();
        entity3.setPosition(new Position(275, 300));

        controller.addEntity(entity1);
        controller.addEntity(entity2);
        controller.addEntity(entity3);

        gameLoop(controller);
    }

    @SuppressWarnings("unused")
    private void mainGameLoop() {
        ContainerView<IEntity> view = new ContainerView<>();
        Controller<IEntity> controller =
                new Controller<>(new Container<>(new ArrayList<IEntity>()), view);

        controller.addEntity(new Entity(new Position(250, 250)));

        gameLoop(controller);
    }

    private void gameLoop(IController<?> controller) {
        double updateInterval = 1.0d / FPS;
        updateInterval *= 1E9; // seconds to nanoseconds

        double currentTime = System.nanoTime();
        double lastTime = currentTime;
        while (true)
            if (System.nanoTime() > updateInterval + lastTime) {
                currentTime = System.nanoTime();
                controller.update((currentTime - lastTime) / 1E9);
                lastTime = currentTime;
            }
    }
}
