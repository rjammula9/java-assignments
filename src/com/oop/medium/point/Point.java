package com.oop.medium.point;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromAnotherPoint(Point anotherPoint) {
        int dx = x - anotherPoint.x;
        int dy = y - anotherPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double slopeWithAnotherPoint(Point anotherPoint) {
        if (x == anotherPoint.x) {
            throw new ArithmeticException("Vertical slope");
        }
        return (double) (y - anotherPoint.y) / (x - anotherPoint.x);
    }

    public boolean isCollinear(Point point1, Point point2) {
        double slope1 = slopeWithAnotherPoint(point1);
        double slope2 = slopeWithAnotherPoint(point2);
        return slope1 == slope2;
    }

    public Point midPoint(Point anotherPoint) {
        int midX = (x + anotherPoint.x) / 2;
        int midY = (y + anotherPoint.y) / 2;
        return new Point(midX, midY);
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public boolean isVertical(Point anotherPoint) {
        return x == anotherPoint.x;
    }

    public boolean isHorizontal(Point anotherPoint) {
        return y == anotherPoint.y;
    }

    public int quadrant() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Creating points
        Point point1 = new Point(2, 3);
        Point point2 = new Point(5, 7);

        // Testing distanceFromAnotherPoint method
        double distance = point1.distanceFromAnotherPoint(point2);
        System.out.println("Distance between point1 and point2: " + distance);

        // Testing slopeWithAnotherPoint method
        double slope = point1.slopeWithAnotherPoint(point2);
        System.out.println("Slope between point1 and point2: " + slope);

        // Testing isCollinear method
        Point point3 = new Point(8, 11);
        boolean isCollinear = point1.isCollinear(point2, point3);
        System.out.println("Points point1, point2, and point3 are collinear: " + isCollinear);

        Point midPoint = point1.midPoint(point2);
        System.out.println("Midpoint between point1 and point2: (" + midPoint.x + ", " + midPoint.y + ")");
        double distanceFromOrigin = point1.distanceFromOrigin();
        System.out.println("Distance of point1 from origin: " + distanceFromOrigin);
        double distanceFromOrigin1 = point2.distanceFromOrigin();
        System.out.println("Distance of point2 from origin: " + distanceFromOrigin);
        // Testing isVertical method
        boolean isVertical = point1.isVertical(point2);
        System.out.println("Points point1 and point2 are vertical: " + isVertical);

        // Testing isHorizontal method
        boolean isHorizontal = point1.isHorizontal(point2);
        System.out.println("Points point1 and point2 are horizontal: " + isHorizontal);

        // Testing quadrant method
        int quadrant = point1.quadrant();
        System.out.println("Point1 lies in quadrant: " + quadrant);

    }
}
