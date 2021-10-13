package basic.figure2;

public class FigureSample {
    public static void main(String[] args) {
        //インスタンスの作成
        Figure[] figures = {
                new Rectangle(8,4),
                new Triangle(5,25),
                new Circle(8)
        };

        for (Figure figure:figures) {
            //System.out.println(figure.getArea());
            //上のように書くこともできるがこれは面積しか出てこない
            System.out.println(figure);
        }
    }
}
