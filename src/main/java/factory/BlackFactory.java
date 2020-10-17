package factory;

import models.circle.BlackCircle;
import models.circle.Circle;
import models.triangle.BlackTriangle;
import models.triangle.Triangle;

public class BlackFactory implements BaseFactory {
    public Circle createCircle() {
        return new BlackCircle();
    }

    public Triangle createTriangle() {
        return new BlackTriangle();
    }
}
