package basic.figure2;

public class Triangle extends Figure {
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

    public double getArea(){
        return (height * base)/2;
    }

    @Override
    public String toString() {
        return String.format("長方形 高さ:%.2f 底辺:%.2f 面積:%.2f",
        height,base,getArea());
    }
}
