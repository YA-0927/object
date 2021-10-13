package basic.figure3;

class Circle implements IfGetArea{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public String toString() {
        return String.format("円 半径:%.2f 面積:%.2f",
                radius,getArea());
    }

    @Override
    public double getArea() {
        return Math.PI*(Math.pow(radius,2));
    }
}