package com.mibac.lifesimulator.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.mibac.lifesimulator.entities.BasicEntity;
import com.mibac.lifesimulator.utils.Position;

public class BasicContainerView extends MoveableContainerView<BasicEntity> {
    private static final long serialVersionUID = 3L;

    @Override
    public void paint(Graphics g) {
        BufferedImage buffer =
                new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D) buffer.getGraphics();

        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, getWidth(), getHeight());

        for (BasicEntity entity : container.getEntities()) {
            Position copy = new Position(entity.getPosition());
            copy.add(offsetX, offsetY);

            graphics.setColor(Color.green);
            drawCenteredOval(graphics, copy, 10, 10);

            if (entity.getTarget() != null) {
                graphics.setColor(Color.red);
                graphics.drawLine(copy.getX(), copy.getY(), entity.getTarget().getX() + offsetX,
                        entity.getTarget().getY() + offsetY);
            }
        }

        g.drawImage(buffer, 0, 0, getWidth(), getHeight(), 0, 0, buffer.getWidth(),
                buffer.getHeight(), this);
    }
}
