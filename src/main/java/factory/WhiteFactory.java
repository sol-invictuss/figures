package factory;

import models.circle.Circle;
import models.circle.WhiteCircle;
import models.triangle.Triangle;
import models.triangle.WhiteTriangle;

public class WhiteFactory implements BaseFactory {
    public Circle createCircle() {
        return new WhiteCircle();
    }

    public Triangle createTriangle() {
        return new WhiteTriangle();
    }
}
