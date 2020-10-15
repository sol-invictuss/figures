package models.triangle;

public abstract class Triangle {

    abstract void describe();

    double countSquare(double side) {
        return 0.5 * side * side;
    }
}