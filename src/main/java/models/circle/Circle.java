package models.circle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Circle {

    private double radius;

    public abstract void describe();

    double countSquare() {
        return Math.PI * radius * radius;
    }

}
