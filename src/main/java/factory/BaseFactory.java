package factory;

import models.circle.Circle;
import models.triangle.Triangle;

public interface BaseFactory {
    Circle createCircle();
    Triangle createTriangle();
}
