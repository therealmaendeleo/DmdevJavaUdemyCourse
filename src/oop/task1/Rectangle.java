package oop.task1;

public class Rectangle {
    private Point leftTopPoint;
    private Point rightBottomPoint;

    public Rectangle(Point leftTopPoint, Point rightBottomPoint) {
        this.leftTopPoint = leftTopPoint;
        this.rightBottomPoint = rightBottomPoint;
    }

    public int calcSquare() {
        return (rightBottomPoint.getX() - leftTopPoint.getX()) *
            (leftTopPoint.getY() - rightBottomPoint.getY());
    }

    public double calcDiagonal() {
        return leftTopPoint.calcDistance(rightBottomPoint);
    }
}
