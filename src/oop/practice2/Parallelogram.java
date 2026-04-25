package oop.practice2;

import oop.task1.Point;

import java.awt.*;
import java.util.List;

public class Parallelogram extends PolygonalShape2D implements WithHeight {

    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super();
        validate(p1, p2, p3, p4);
        this.points = List.of(p1, p2, p3, p4);
    }

    protected boolean hasEqualDiagonals(Point... points) {
        double firstDiagonal = points[0].calcDistance(points[2]);
        double secondDiagonal = points[1].calcDistance(points[3]);
        double epsilon = 0.001d;
        return Math.abs(secondDiagonal - firstDiagonal) < epsilon;
    }

    protected boolean hasEqualSides(Point... points) {
        double firstSide = points[0].calcDistance(points[1]);
        double secondSide = points[1].calcDistance(points[2]);
        double epsilon = 0.001d;
        return Math.abs(firstSide - secondSide) < epsilon;
    }

    @Override
    protected void validate(Point... points) throws InvalidShapeException {
        // проверка, что точки не лежат на одной прямой
        if (ShapeUtils.areCollinear(points[0], points[1], points[2])
                || ShapeUtils.areCollinear(points[1], points[2], points[3])) {

            throw new InvalidShapeException("Received points of " + this.getClass().getSimpleName() +
                                            " object cannot be on the same line");
        }

        // проверка параллельности сторон
        if (!ShapeUtils.areParallel(points[0], points[1], points[2], points[3])
                || !ShapeUtils.areParallel(points[1], points[2], points[3], points[0])) {

            throw new InvalidShapeException("Received points do not form 2 pairs of parallel lines");
        }

        // проверка свойства середин диагоналей
        int midACX = points[0].getX() + points[2].getX();
        int midACY = points[0].getY() + points[2].getY();
        int midBDX = points[1].getX() + points[3].getX();
        int midBDY = points[1].getY() + points[3].getY();

        if (midACX != midBDX || midACY != midBDY) {
            throw new InvalidShapeException("Received points do not form a Parallelogram");
        }
    }

    @Override
    public double getHeight() {
        double base = points.get(0).calcDistance(points.get(1));
        return getArea() / base;
    }

    @Override
    public double getArea() {
        Point A = points.get(0);
        Point B = points.get(1);
        Point D = points.get(3);
        // косое произведение векторов
        return Math.abs(
                (B.getX() - A.getX()) * (D.getY() - A.getY()) -
                (D.getX() - A.getX()) * (B.getY() - A.getY())
        );
    }

    @Override
    public String toString() {
        return "Parallelogram:\n" +
               "* area = " + getArea() + "\n" +
               "* height = " + getHeight();
    }
}
