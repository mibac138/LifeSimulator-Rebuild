package com.mibac.lifesimulator.view;

import java.awt.Graphics;

import javax.swing.JFrame;

import com.mibac.lifesimulator.containers.IContainer;

public abstract class AbstractContainerView extends JFrame {
    private static final long serialVersionUID = 1L;
    protected IContainer container;

    protected AbstractContainerView() {
        setVisible(true);
    }

    protected AbstractContainerView(IContainer container) {
        this();
        this.container = container;
    }

    public void setContainer(IContainer container) {
        this.container = container;
    }

    @Override
    public abstract void paint(Graphics g);
}
