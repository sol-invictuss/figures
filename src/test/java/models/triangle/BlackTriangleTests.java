package models.triangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackTriangleTests {

    BlackTriangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new BlackTriangle();
    }

    @Test
    void squareWithBaselineAndHeights() {
        Double expectedSquare = 50.0;
        Double actualSquare = triangle.square(10, 10);
        assertEquals(expectedSquare, actualSquare);
    }

    @Test
    void squareWithAngleAndTwoSides() {
        Double expectedSquare = 50.0;
        Double actualSquare = triangle.square(10, 10, 90);
        assertEquals(expectedSquare, actualSquare);
    }

    @Test
    void squareWithThreeSides() {
        Double expectedSquare = 6.0;
        Double actualSquare = triangle.squareGeron(3, 4, 5);
        assertEquals(expectedSquare, actualSquare);
    }
}