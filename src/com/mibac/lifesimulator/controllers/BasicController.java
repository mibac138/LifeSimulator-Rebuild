package com.mibac.lifesimulator.controllers;

import com.mibac.lifesimulator.containers.IContainer;
import com.mibac.lifesimulator.view.AbstractContainerView;

public class BasicController implements IController {
    private IContainer container;
    private AbstractContainerView view;

    public BasicController(IContainer container, AbstractContainerView view) {
        this.container = container;
        this.view = view;

        this.view.setContainer(this.container);
    }

    public IContainer getContainer() {
        return container;
    }

    @Override
    public void update() {
        view.repaint();
    }
}
