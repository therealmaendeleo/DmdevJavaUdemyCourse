package oop.practice2;

import oop.task1.Point;

import java.awt.*;

public class Ellipse extends Shape2D {
    protected Point center;
    protected int rx;
    protected int ry;

    public Ellipse(int x, int y, int rx, int ry) {
        validate(x, y, rx, ry);
        center = new Point(x, y);
        this.rx = rx;
        this.ry = ry;
    }

    protected void validate(int x, int y, int rx, int ry) throws InvalidShapeException {
        if (rx <= 0 || ry <= 0) {
            throw new InvalidShapeException("Each ellipse radius must be a positive integer");
        }
    }

    @Override
    public double getArea() {
        return Math.PI * rx * ry;
    }

    @Override
    public void draw(Graphics2D g2) {
        drawEllipse(g2);
    }

    private void drawEllipse(Graphics2D g2) {
        g2.drawOval(center.getX(), center.getY(), 2 * rx, 2 * ry);
    }
}
