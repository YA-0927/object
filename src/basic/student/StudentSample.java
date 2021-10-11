package basic.student;

public class StudentSample {
    public static void main(String[] args) {
        Student student1 =new Student("あいざわ","男",1);
        Student student2 = new Student("さむらごうち","女",6);

        System.out.print("名前：");
        System.out.println(student1.getName());
        System.out.print("性別：");
        System.out.println(student1.getGender());
        System.out.print("学年：小学校");
        System.out.print(student1.getGrade());
        System.out.println("年生");
        System.out.println(student1);
        System.out.print("名前：");
        System.out.println(student2.getName());
        System.out.print("性別：");
        System.out.println(student2.getGender());
        System.out.print("学年：小学校");
        System.out.print(student2.getGrade());
        System.out.println("年生");
        System.out.println(student2);

        student2.setGender("男");
        student2.setGrade(52);

        System.out.print("性別：");
        System.out.println(student2.getGender());
        System.out.print("学年：小学校");
        System.out.print(student2.getGrade());
        System.out.println("年生");
        System.out.println(student2);
    }
}
