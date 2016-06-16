package com.mibac.lifesimulator;

import org.junit.Test;

import com.mibac.lifesimulator.utils.Position;

import junit.framework.TestCase;

public class PositionTest extends TestCase {
    @Test
    public void testPosition() {
        Position position = new Position(Math.random() * 800, Math.random() * 600);

        assertEquals((int) position.x, position.getX());
        assertEquals((int) position.y, position.getY());

        assertEquals(position, position);
    }
}
