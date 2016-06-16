package com.mibac.lifesimulator;

import org.junit.Test;

import com.mibac.lifesimulator.entities.Entity;
import com.mibac.lifesimulator.entities.IEntity;
import com.mibac.lifesimulator.utils.Position;

import junit.framework.TestCase;

public class EntityTest extends TestCase {
    @Test
    public void testPosition() {
        IEntity entity = new Entity();

        assertEquals("Newly created entity has position different from the default one",
                entity.getPosition(), new Position());

        Position position = new Position(Math.random() * 800, Math.random() * 600);
        entity.setPosition(position);

        assertEquals("Entity's position didn't change even though setPosition was used",
                entity.getPosition(), position);
    }
}
