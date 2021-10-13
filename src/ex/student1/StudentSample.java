package ex.student1;

//Studentクラスを表示する処理
class StudentSample {
    public static void main(String[] args) {
        //5名のインスタンスを配列で作成
        Student[] students = {
                new Student("あいざわ","男",60,50,70),
                new Student("いのうえ","女",90,80,100),
                new Student("うえの","男",40,50,60),
                new Student("えんどう","女",80,20,60),
                new Student("おおた","男",70,100,40),
        };

        //表示処理
        for (Student student:students) {
            System.out.println(student);
        }
    }
}