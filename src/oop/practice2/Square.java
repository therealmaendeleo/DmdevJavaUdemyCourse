package oop.practice2;

import oop.task1.Point;

public class Square extends Rectangle {

    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    protected void validate(Point... points) throws InvalidShapeException {
        super.validate(points);
        if (!hasEqualDiagonals(points)) {
            throw new InvalidShapeException("Diagonals of Rectangle must be equal");
        }
    }

    @Override
    public String toString() {
        return "Rectangle:\n" +
               "* area = " + getArea() + "\n";
    }
}
