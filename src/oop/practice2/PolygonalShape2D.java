package oop.practice2;

import oop.task1.Point;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public abstract class PolygonalShape2D extends Shape2D {
    protected List<Point> points;

    public PolygonalShape2D() {
        this.points = new LinkedList<>();
    }

    protected abstract void validate(Point... points) throws InvalidShapeException;

    @Override
    public void draw(Graphics2D g2) {
        drawPolygon(g2);
    }

    private void drawPolygon(Graphics2D g2) {
        g2.drawPolygon(
                points.stream().mapToInt(oop.task1.Point::getX).toArray(),
                points.stream().mapToInt(Point::getY).toArray(),
                points.size()
        );
    }
}
