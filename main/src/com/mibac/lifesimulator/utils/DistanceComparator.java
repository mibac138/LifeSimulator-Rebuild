package com.mibac.lifesimulator.utils;

import java.util.Comparator;

import com.mibac.lifesimulator.entities.IEntity;

public class DistanceComparator {
    private DistanceComparator() {}

    /**
     * Compares distance between base position (<code>compared</code>) and positions from
     * {@link #compare(Position, Position) compare} method. If <code>compared</code> is a
     * {@link IEntity entity} it uses {@link IEntity#getPosition() getPosition} method
     *
     * @author Michał "Mibac" Bączkowski
     */
    public static class PositionComparator implements Comparator<Position> {
        private Position compared;

        /**
         * One of two constructors. This one is the same as calling
         * {@link #PositionComparator(Position)} with <code>entity.getPosition()</code>
         *
         * @param compared - IEntity which you want to compare distance to
         */
        public PositionComparator(IEntity compared) {
            this(compared.getPosition());
        }

        /**
         * Main constructor.
         *
         * @param compared - Position which you want to compare distance to
         */
        public PositionComparator(Position compared) {
            this.compared = compared;
        }

        @Override
        public int compare(Position o1, Position o2) {
            double d1 = o1.distance(compared);
            double d2 = o2.distance(compared);

            return (int) (d1 - d2);
        }
    }

    /**
     * Compares distance between base position (<code>compared</code>) and positions from
     * {@link #compare(Position, Position) compare} method. If <code>compared</code> is a
     * {@link IEntity entity} it uses {@link IEntity#getPosition() getPosition} method
     *
     * @author Michał "Mibac" Bączkowski
     */
    public static class EntityComparator implements Comparator<IEntity> {
        private Position compared;

        /**
         * One of two constructors. This one is the same as calling
         * {@link #EntityComparator(Position)} with <code>entity.getPosition()</code>
         *
         * @param compared - IEntity which you want to compare distance to
         */
        public EntityComparator(IEntity compared) {
            this(compared.getPosition());
        }

        /**
         * Main constructor.
         *
         * @param compared - Position which you want to compare distance to
         */
        public EntityComparator(Position compared) {
            this.compared = compared;
        }

        @Override
        public int compare(IEntity o1, IEntity o2) {
            double d1 = o1.getPosition().distance(compared);
            double d2 = o1.getPosition().distance(compared);
            return (int) (d1 - d2);
        }
    }
}
