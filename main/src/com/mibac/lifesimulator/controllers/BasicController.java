package com.mibac.lifesimulator.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mibac.lifesimulator.containers.IContainer;
import com.mibac.lifesimulator.entities.BasicEntity;
import com.mibac.lifesimulator.entities.IEntity;
import com.mibac.lifesimulator.utils.Position;
import com.mibac.lifesimulator.view.ContainerView;

public class BasicController extends Controller<BasicEntity> {
    public BasicController(IContainer<BasicEntity> container, ContainerView<BasicEntity> view) {
        super(container, view);
    }

    @Override
    public void update(double delta) {
        List<IEntity> copy = new ArrayList<>(container.getEntities());
        for (Iterator<BasicEntity> iterator = container.getEntities().iterator(); iterator
                .hasNext();) {
            BasicEntity entity = iterator.next();
            entity.update(copy);

            movement(entity, delta);
        }

        view.repaint();
    }

    protected void movement(BasicEntity entity, double delta) {
        Position position = entity.getPosition();
        Position target = entity.getTarget();

        if (target != null && !target.equals(position)) {
            double speed = entity.getSpeed() * delta;
            double distance = target.distance(position);

            if (distance > speed) {
                double x = target.x - position.x;
                double y = target.y - position.y;
                double alpha = speed / distance;

                entity.getPosition().x += x * alpha;
                entity.getPosition().y += y * alpha;
            } else
                entity.setPosition(target);
        }
    }
}
