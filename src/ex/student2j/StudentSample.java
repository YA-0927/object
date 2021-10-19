package ex.student2j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Studentクラスを表示する処理
class StudentSample {
    public static void main(String[] args) {
        //5名のインスタンスを配列で作成
        List<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(
                new Student("あいざわ", Student.Gender.MEN,60,50,70),
                new Student("いのうえ", Student.Gender.WOMEN,90,80,100),
                new Student("うえの", Student.Gender.MEN,40,50,60),
                new Student("えんどう", Student.Gender.WOMEN,80,20,60),
                new Student("おおた", Student.Gender.MEN,70,100,40)
                ));

        //表示処理
        for (Student student:students) {
            System.out.println(student);
        }
    }
}