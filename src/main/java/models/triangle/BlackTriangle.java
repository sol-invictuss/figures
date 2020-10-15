package models.triangle;

public class BlackTriangle extends Triangle {

    private int baseline, height; // для формулы через основание и высоту
    private int side_a, side_b, angle_ab; // через две стороны и угол
    private int side_c; // для формулы Герона

    public BlackTriangle(){
        baseline =0;
        height = 0;
        side_a = 0;
        side_b = 0;
        angle_ab = 0;
        side_c = 0;
    }

    public BlackTriangle(int baseline, int height, int side_a, int side_b, int angle_ab, int side_c) {
        this.baseline = baseline;
        this.height = height;
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
        this.angle_ab = angle_ab;
    }

    public int getBaseline() {
        return baseline;
    }

    public void setBaseline(int baseline) {
        this.baseline = baseline;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide_a() {
        return side_a;
    }

    public void setSide_a(int side_a) {
        this.side_a = side_a;
    }

    public int getSide_b() {
        return side_b;
    }

    public void setSide_b(int side_b) {
        this.side_b = side_b;
    }

    public int getAngle_ab() {
        return angle_ab;
    }

    public void setAngle_ab(int angle_ab) {
        this.angle_ab = angle_ab;
    }

    public int getSide_c() {
        return side_c;
    }

    public void setSide_c(int side_c) {
        this.side_c = side_c;
    }

    // через основание и высоту
    public double square(int baseline, int height){
        return 0.5*baseline*height;
    }

    // через две стороны и угол между ними
    public double square(int side_a, int side_b, int angle_ab) {
        return 0.5 * side_a * side_b * Math.sin(angle_ab);
    }

    //для формулы Герона (по 3м  сторонам)
    public double squareGeron(int side_a, int side_b, int side_c){
        double p = 0.5*(side_a + side_b + side_c);
        return Math.sqrt(p*(p-side_a)*(p-side_b)*(p-side_c));
    }

    public void describe() {
        System.out.println("TRIANGLE: BLACK");
    }

}
