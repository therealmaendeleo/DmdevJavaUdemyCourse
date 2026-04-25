package oop.task1;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calcDistance(Point point) {
        int xDiff = Math.abs(x - point.x);
        int yDiff = Math.abs(y - point.y);
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
