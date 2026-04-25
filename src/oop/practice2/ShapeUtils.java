package oop.practice2;

import oop.task1.Point;
import oop.task1.Rectangle;

public final class ShapeUtils {

    private ShapeUtils() { }

    public static boolean areCollinear(Point... points) {
        return (points[1].getY() - points[0].getY()) * (points[2].getX() - points[1].getX()) ==
               (points[2].getY() - points[1].getY()) * (points[1].getX() - points[0].getX());
    }

    public static boolean areParallel(Point p1, Point p2, Point p3, Point p4) {
        long val = (long) (p2.getY() - p1.getY()) * (p4.getX() - p3.getX()) -
                   (long) (p4.getY() - p3.getY()) * (p2.getX() - p1.getX());
        return val == 0;
    }

    public static boolean isRectangle(Point... points) {
        if (points.length != 4) {
            return false;
        }
        // проверка, лежат ли точки на одной прямой
        if (areCollinear(points[0], points[1], points[2]) || areCollinear(points[1], points[2], points[3])) {
            return false;
        }

        // проверка параллельности сторон
        if (!areParallel(points[0], points[1], points[2], points[3])
            || !areParallel(points[1], points[2], points[3], points[0])) {

            return false;
        }

        // проверка равенства диагоналей
        double firstDiagonal = points[0].calcDistance(points[2]);
        double secondDiagonal = points[1].calcDistance(points[3]);
        double epsilon = 0.001d;
        if (Math.abs(secondDiagonal - firstDiagonal) >= epsilon) {
            return false;
        }
        return true;
    }

    public static boolean isTriangle(Point... points) {
        if (points.length != 3) {
            return false;
        }
        if (areCollinear(points)) {
            return false;
        }
        return true;
    }
}
