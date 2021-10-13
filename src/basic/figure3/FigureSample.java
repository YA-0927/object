package basic.figure3;

public class FigureSample {
    public static void main(String[] args) {
        IfGetArea[] figures = { //インターフェース型から持ってくる形になる。インターフェースもクラスなので変数の型として利用することができる。
                new Rectangle(8, 4),
                new Triangle(5, 25),
                new Circle(8)
        };

        for (IfGetArea figure : figures) {
            //System.out.println(figure.getArea());
            //上のように書くこともできるがこれは面積しか出てこない
            System.out.println(figure);
        }
    }
}

