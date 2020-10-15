package models.circle;

public abstract class Circle {

    private double radius;

    public abstract void describe();

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double countSquare() {
        return Math.PI * radius * radius;
    }

}
