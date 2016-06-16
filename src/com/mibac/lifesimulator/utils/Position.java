package com.mibac.lifesimulator.utils;

import com.mibac.lifesimulator.entities.IEntity;

/**
 * Class used for representing {@link IEntity entities} position
 *
 * @author Michał "Mibac" Bączkowski
 *
 */
public class Position {
    /**
     * X coordinate
     */
    public double x;
    /**
     * Y coordinate
     */
    public double y;

    public Position(double x, double y) {
        setPosition(x, y);
    }

    public Position(Position p) {
        this(p.x, p.y);
    }

    public Position() {
        this(0, 0);
    }

    /**
     * Mainly used for converting {@code double} to {@code int}.
     *
     * @return {@link #x} casted to {@code int}
     */
    public int getX() {
        return (int) x;
    }

    /**
     * Mainly used for converting {@code double} to {@code int}
     *
     * @return {@link #y} casted to {@code int}
     */
    public int getY() {
        return (int) y;
    }

    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setPosition(Position p) {
        setPosition(p.x, p.y);
    }

    /**
     *
     * @param second
     * @return distance between this and {@code second} position
     */
    public double distance(Position second) {
        double x = this.x - second.x;
        double y = this.y - second.y;

        return Math.sqrt(x * x + y * y);
    }

    public double distance(double x, double y) {
        final double _x = this.x - x;
        final double _y = this.y - y;

        return Math.sqrt(_x * _x + _y * _y);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;

        if (other instanceof Position) {
            Position that = (Position) other;
            return Math.abs(this.x - that.x) < .0000001 && Math.abs(this.y - that.y) < .0000001;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return 41 * (41 + getX()) + getY();
    }
}
