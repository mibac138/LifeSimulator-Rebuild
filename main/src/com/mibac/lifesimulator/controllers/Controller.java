package com.mibac.lifesimulator.controllers;

import com.mibac.lifesimulator.containers.IContainer;
import com.mibac.lifesimulator.entities.IEntity;
import com.mibac.lifesimulator.view.ContainerView;

public class Controller<T extends IEntity> implements IController<T> {
    protected IContainer<T> container;
    protected ContainerView<T> view;

    public Controller(IContainer<T> container, ContainerView<T> view) {
        this.container = container;
        this.view = view;

        this.view.setContainer(this.container);
    }

    @Override
    public void update(double delta) {
        view.repaint();
    }

    @Override
    public void addEntity(T entity) {
        container.addEntity(entity);
    }

    @Override
    public boolean removeEntity(T entity) {
        return container.removeEntity(entity);
    }
}
