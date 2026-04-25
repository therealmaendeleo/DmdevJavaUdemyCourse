package oop.practice2;

import oop.task1.Point;

import java.util.List;

public class Trapezoid extends PolygonalShape2D implements WithHeight {

    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super();
        validate(p1, p2, p3, p4);
        this.points = List.of(p1, p2, p3, p4);
    }

    @Override
    protected void validate(Point... points) throws InvalidShapeException {
        if (ShapeUtils.areCollinear(points[0], points[1], points[2])
            || ShapeUtils.areCollinear(points[1], points[2], points[3])) {

            throw new InvalidShapeException("Points of " + this.getClass().getSimpleName() +
                                            " object cannot be on the same line");
        }
        if (!ShapeUtils.areParallel(points[0], points[1], points[2], points[3])
            || ShapeUtils.areParallel(points[1], points[2], points[3], points[0])) {

            throw new InvalidShapeException("Points don't form a Trapezoid or do form Parallelogram");
        }
        if (points[0].getX() > points[3].getX() || points[1].getX() < points[2].getX()) {
            throw new InvalidShapeException("Points don't form a Trapezoid");
        }
    }

    @Override
    public double getHeight() {
        return 2 * getArea() / (
                points.get(0).calcDistance(points.get(1)) +
                points.get(2).calcDistance(points.get(3))
        );
    }

    @Override
    public double getArea() {
        // через площадь двух треугольников
        double firstTriangleArea = new Triangle(points.get(0), points.get(1), points.get(3)).getArea();
        double secondTriangleArea = new Triangle(points.get(1), points.get(2), points.get(3)).getArea();
        return firstTriangleArea + secondTriangleArea;
    }

    @Override
    public String toString() {
        return "Trapezoid:\n" +
               "* area = " + getArea() + "\n" +
               "* height = " + getHeight();
    }
}
