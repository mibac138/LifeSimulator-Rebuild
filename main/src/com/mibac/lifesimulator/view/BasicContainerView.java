package com.mibac.lifesimulator.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.mibac.lifesimulator.entities.BasicEntity;

public class BasicContainerView extends ContainerView<BasicEntity> {
    private static final long serialVersionUID = 1L;

    @Override
    public void paint(Graphics g) {
        BufferedImage buffer =
                new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D) buffer.getGraphics();

        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, getWidth(), getHeight());

        for (BasicEntity entity : container.getEntities()) {
            graphics.setColor(Color.green);
            drawCenteredOval(graphics, entity.getPosition(), 10);
            graphics.setColor(Color.red);
            graphics.drawLine(entity.getPosition().getX(), entity.getPosition().getY(),
                    entity.getTarget().getX(), entity.getTarget().getY());
        }
        g.drawImage(buffer, 0, 0, getWidth(), getHeight(), 0, 0, buffer.getWidth(),
                buffer.getHeight(), this);
    }
}
