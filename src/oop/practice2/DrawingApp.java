package oop.practice2;

import javax.swing.*;

public class DrawingApp {
    private final JFrame frame;
    private final Canvas canvas;

    public DrawingApp(String title, int width, int height) {
        this.frame = new JFrame(title);
        this.canvas = new Canvas();

        frame.add(canvas);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addShape(Shape2D shape) {
        canvas.addShape(shape);
    }

    public void addShapes(Shape2D... shapes) {
        for (Shape2D shape : shapes) {
            canvas.addShape(shape);
        }
    }

    public void show() {
        frame.setVisible(true);
    }
}
