package com.mibac.lifesimulator.utils;

import java.util.Comparator;

import com.mibac.lifesimulator.entities.IEntity;

public class DistanceComparator {
    private DistanceComparator() {}

    public static class PositionComparator implements Comparator<Position> {
        private Position compared;

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

    public static class EntityComparator implements Comparator<IEntity> {
        private Position compared;

        public EntityComparator(IEntity compared) {
            this(compared.getPosition());
        }

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
