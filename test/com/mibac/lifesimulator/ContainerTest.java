package com.mibac.lifesimulator;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.mibac.lifesimulator.containers.Container;
import com.mibac.lifesimulator.entities.Entity;
import com.mibac.lifesimulator.entities.IEntity;

import junit.framework.TestCase;

public class ContainerTest extends TestCase {
    private Container<IEntity> container;

    @Override
    @Before
    public void setUp() throws Exception {
        this.container = new Container<>(new ArrayList<>());
    }

    @Test
    public void testNullList() {
        try {
            new Container<>(null);
            fail("Container didn't throw IllegalArgumentException when null argument was given");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void test() {
        Entity e = new Entity();
        container.addEntity(e);
        assertTrue(container.getEntities().contains(e));

        container.removeEntity(e);
        assertFalse(container.getEntities().contains(e));
    }

}
