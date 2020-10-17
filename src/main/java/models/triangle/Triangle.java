package models.triangle;

import lombok.Getter;
import lombok.Setter;

import java.lang.*;

@Getter
@Setter
public abstract class Triangle {

    private int baseline, height; // для формулы через основание и высоту
    private int side_a, side_b, angle_ab; // через две стороны и угол
    private int side_c; // для формулы Герона

    public Triangle(){
        baseline =0;
        height = 0;
        side_a = 0;
        side_b = 0;
        angle_ab = 0;
        side_c = 0;
    }

    public Triangle(int baseline, int height, int side_a, int side_b, int angle_ab, int side_c) {
        this.baseline = baseline;
        this.height = height;
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
        this.angle_ab = angle_ab;
    }

    // через основание и высоту
    public double square(int baseline, int height){
        return 0.5*baseline*height;
    }

    // через две стороны и угол между ними
    public double square(int side_a, int side_b, int angle_ab) {
        return 0.5 * side_a * side_b * Math.sin(angle_ab * Math.PI / 180);
    }

    //для формулы Герона (по 3м  сторонам)
    public double squareGeron(int side_a, int side_b, int side_c){
        double p = 0.5*(side_a + side_b + side_c);
        return Math.sqrt(p*(p-side_a)*(p-side_b)*(p-side_c));
    }
    abstract void describe();

}