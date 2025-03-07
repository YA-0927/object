package ex.student2;

import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Studentクラスを表示する処理
class StudentSample {
    public static void main(String[] args) {
        //5名のインスタンスをArrayListで作成
        List<Student> students = new ArrayList<>();

        students.addAll(Arrays.asList(
                new Student("あいざわ", Gender.MEN,60,50,70),
                new Student("いのうえ",Gender.WOMEN,90,80,100),
                new Student("うえの",Gender.MEN,40,50,60),
                new Student("えんどう",Gender.WOMEN,80,20,60),
                new Student("おおた",Gender.MEN,70,100,40)
        ));

        //表示処理
        for (Student student:students) {
            System.out.println(student);
        }
    }
}