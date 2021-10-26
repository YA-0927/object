package sample.map.student;

import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentMapSample {
    public static void main(String[] args) {
        //クラスごとのマップ
        Map<String, List<Student>> studentGroupMap = new HashMap<>(40);
        //学生のリスト
        List<Student> studentList = new ArrayList<>(100);
        studentList.add(new Student("1-1", "やまだ", Gender.MEN, 60, 50, 70));
        studentList.add(new Student("1-1", "たけだ", Gender.WOMEN, 70, 100, 30));
        studentList.add(new Student("1-1", "かまだ", Gender.MEN, 100, 80, 90));
        studentList.add(new Student("1-2", "いいだ", Gender.MEN, 70, 90, 50));
        studentList.add(new Student("1-2", "やすだ", Gender.WOMEN, 60, 70, 80));
        studentList.add(new Student("1-2", "わしだ", Gender.MEN, 0, 20, 80));
        studentList.add(new Student("1-3", "たかだ", Gender.WOMEN, 70, 100, 50));
        studentList.add(new Student("1-3", "かねだ", Gender.WOMEN, 60, 70, 80));
        studentList.add(new Student("1-4", "さとう", Gender.MEN, 70, 90, 50));
        studentList.add(new Student("1-4", "すずき", Gender.WOMEN, 60, 70, 80));
        studentList.add(new Student("1-4", "たかはし", Gender.MEN, 0, 20, 80));
        studentList.add(new Student("1-5", "ふるた", Gender.WOMEN, 70, 100, 50));
        studentList.add(new Student("1-5", "たがみ", Gender.WOMEN, 60, 70, 80));
        studentList.add(new Student("1-5", "あいもの", Gender.WOMEN, 40, 40, 50));

        for (Student student : studentList) {
            //マップに存在するクラスの生徒が出現
            if (studentGroupMap.containsKey(student.getGroup())) {
                //リストに追加
                studentGroupMap.get(student.getGroup()).add(student);
            } else {
                //新しいキーを作成
                //空のリストをセット
                List<Student> list = new ArrayList<>();
                list.add(student);
                studentGroupMap.put(student.getGroup(), list);
            }
        }


        for (Map.Entry entry : studentGroupMap.entrySet()) {
            double sumJap = 0, sumMath = 0, sumEng = 0;
            for (Student student : (List<Student>) entry.getValue()) {
                sumJap += student.getJap();
                sumMath += student.getMath();
                sumEng += student.getEng();
            }

            //<?>はワイルドカード
            double aveJap = sumJap / ((List<?>) entry.getValue()).size();
            double aveMath = sumMath / ((List<?>) entry.getValue()).size();
            double aveEng = sumEng / ((List<?>) entry.getValue()).size();

            System.out.println(String.format("%s %.2f %.2f %.2f", entry.getKey(), aveJap, aveMath, aveEng));
        }
    }
}
