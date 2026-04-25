package oop.practice2;

import oop.task1.Point;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.BasicStroke;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape2D implements Drawable {

    public abstract double getArea();

    public boolean hasEqualArea(Shape2D shape) {
        double epsilon = 0.001d;
        return Math.abs(getArea() - shape.getArea()) < epsilon;
    }
}
