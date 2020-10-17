package models.circle;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BlackCircleTests {

    Circle circle;

    @BeforeEach
    void setUp() {
        circle = new BlackCircle();
    }

    @Test
    void getRadius() {
        Double expectedRadius = 21.0;
        circle.setRadius(expectedRadius);
        Double actualRadius = circle.getRadius();
        assertEquals(expectedRadius, actualRadius);
    }

    @Test
    void setRadius() {
        Double expectedRadius = 21.0;
        circle.setRadius(expectedRadius);

        Double actualRadius = circle.getRadius();
        assertEquals(expectedRadius, actualRadius);
    }

    @Test
    void countSquare() {
        Double radius = 21.0;
        circle.setRadius(radius);

        Double expectedSquareValue = Math.PI * radius * radius;
        Double actualSquareValue = circle.countSquare();
        assertEquals(expectedSquareValue, actualSquareValue);
    }
}