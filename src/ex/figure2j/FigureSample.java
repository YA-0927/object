package ex.figure2j;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FigureSample {
    public static void main(String[] args) {
        //インスタンスの作成
        //スーパークラスから引っ張ってきている
       List<Figure> figures = new ArrayList<>();
        figures.addAll(Arrays.asList(
                new Rectangle(8,4),
                new Triangle(5,25),
                new Circle(8)
        ));

        for (Figure figure:figures) {
            //System.out.println(figure.getArea());
            //上のように書くこともできるがこれは面積しか出てこない
            System.out.println(figure);
        }


    }
}
