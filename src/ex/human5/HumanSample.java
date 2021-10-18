package ex.human5;

import basic.human5.IfSayHello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HumanSample {
    public static void main(String[] args) {

        List<IfSayHello> humans = new ArrayList<>();
        //InterFaceにも使える
        humans.addAll(Arrays.asList(
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new French("Andrée")
        ));

        for (IfSayHello human:humans) {
            human.sayHello();
        }
    }
}