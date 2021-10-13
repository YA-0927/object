package basic.figure3;

public class Triangle implements IfGetArea{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = Triangle.this.base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    @Override
    public String toString() {
        return String.format("長方形 高さ:%.2f 底辺:%.2f 面積:%.2f",
        height,base,getArea());
    }

    @Override
    public double getArea() {
        return base * height /2.0;
    }
}
