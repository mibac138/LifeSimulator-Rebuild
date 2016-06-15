package com.mibac.lifesimulator.utils;

public class Position {
    public double x;
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

    public double distance(Position p) {
        double x = this.x - p.x;
        double y = this.y - p.y;

        return Math.sqrt(x * x + y * y);
    }

    public double distance(double x, double y) {
        final double _x = this.x - x;
        final double _y = this.y - y;

        return Math.sqrt(_x * _x + _y * _y);
    }
}
