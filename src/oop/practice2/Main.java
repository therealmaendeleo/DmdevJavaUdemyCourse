package oop.practice2;

import oop.task1.Point;

/**
 * Точки для создания многоугольников необходимо передавать в строгом порядке
 * с нижнего левого угла и далее по часовой стрелке
 */

public class Main {
    static void main() {
        DrawingApp app = new DrawingApp("Drawing 2D Shapes", 2800, 1200);
        app.addShapes(
            new Triangle(new Point(50, 400), new Point(700, 400), new Point(500, 50)),
            new Parallelogram(
                new Point(800, 400), new Point(1200, 400), new Point(1400, 50), new Point(1000, 50)
            ),
            new Trapezoid(
                new Point(1500, 400), new Point(2100, 400), new Point(2100, 50), new Point(1700, 50)
            ),
            new Rectangle(
                new Point(2200, 400), new Point(2700, 400), new Point(2700, 50), new Point(2200, 50)
            ),
            new Square(
                new Point(200, 1100), new Point(500, 1100), new Point(500, 800), new Point(200, 800)
            ),
            new Ellipse(1000, 800, 400, 150),
            new Circle(2000, 700, 200)
        );
        app.show();
    }
}
