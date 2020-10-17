package models.circle;

import org.junit.jupiter.api.BeforeEach;

public class WhiteCircleTests extends BlackCircleTests {
    @BeforeEach
    void setUp() {
        circle = new WhiteCircle();
    }
}
