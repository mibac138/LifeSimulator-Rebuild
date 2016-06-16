package com.mibac.lifesimulator.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import com.mibac.lifesimulator.containers.IContainer;
import com.mibac.lifesimulator.entities.IEntity;
import com.mibac.lifesimulator.utils.Position;

public class ContainerView<T extends IEntity> extends JFrame {
    private static final long serialVersionUID = 1L;
    protected transient IContainer<T> container;

    public ContainerView() {
        setSize(800, 600);
        setVisible(true);
    }

    public ContainerView(IContainer<T> container) {
        this();
        this.container = container;
    }

    public void setContainer(IContainer<T> container) {
        this.container = container;
    }

    @Override
    public void paint(Graphics g) {
        BufferedImage buffer =
                new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D) buffer.getGraphics();

        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, getWidth(), getHeight());

        graphics.setColor(Color.green);
        for (IEntity entity : container.getEntities())
            drawCenteredOval(graphics, entity.getPosition(), 50);

        g.drawImage(buffer, 0, 0, getWidth(), getHeight(), 0, 0, buffer.getWidth(),
                buffer.getHeight(), this);
    }

    protected void drawCenteredOval(Graphics2D graphics, Position center, int r) {
        int r2 = r / 2;
        int x = center.getX() - r2;
        int y = center.getY() - r2;
        graphics.fillOval(x, y, r, r);
    }
}
