package oop.practice2;

import oop.task1.Point;

import java.awt.*;
import java.util.List;

public class Triangle extends PolygonalShape2D implements WithHeight {

    public Triangle(Point p1, Point p2, Point p3) throws InvalidShapeException {
        super();
        validate(p1, p2, p3);
        this.points = List.of(p1, p2, p3);
    }

    @Override
    protected void validate(Point... points) throws InvalidShapeException {
        if (ShapeUtils.areCollinear(points)) {
            throw new InvalidShapeException("Points of " + this.getClass().getSimpleName() +
                                            " object cannot be on the same line");
        }
    }

    @Override
    public double getHeight() {
        double base = points.get(0).calcDistance(points.get(1));
        return 2 * getArea() / base;
    }

    @Override
    public double getArea() {
        // формула Гаусса
        return Math.abs(
                points.get(0).getX() * (points.get(1).getY() - points.get(2).getY()) +
                points.get(1).getX() * (points.get(2).getY() - points.get(0).getY()) +
                points.get(2).getX() * (points.get(0).getY() - points.get(1).getY())
        ) / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle:\n" +
               "* area = " + getArea() + "\n" +
               "* height = " + getHeight();
    }
}
