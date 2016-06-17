package com.mibac.lifesimulator.utils;

import java.awt.Point;

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

    public Position(Point p) {
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

    /**
     * Changes this position to the given one
     *
     * @param x - new x value for this position
     * @param y - new y value for this position
     */
    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Changes this position to the given one
     *
     * @param p - new x and y value for this position
     */
    public void setPosition(Position p) {
        setPosition(p.x, p.y);
    }

    public void add(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void subtract(double x, double y) {
        this.x -= x;
        this.y -= y;
    }

    public void multiply(double x, double y) {
        this.x *= x;
        this.y *= y;
    }

    public void divide(double x, double y) {
        this.x /= x;
        this.y /= y;
    }

    /**
     * Calculates distance between this and given (<code>second</code>) position.
     *
     * @param second - another position you want to get distance to
     * @return distance between this and <code>second</code> position
     */
    public double distance(Position second) {
        return distance(second.x, second.y);
    }

    /**
     * @see #distance(Position)
     */
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
