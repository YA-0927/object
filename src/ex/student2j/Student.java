package ex.student2j;

//学生クラス
class Student {

    //列挙型性別
    enum Gender{
        MEN("男"),
        WOMEN("女");

        private String jpName;

        Gender(String jpName) {
            this.jpName = jpName;
        }
    }


    //フィールド
    private String name;//名前
    private Gender gender;
    private int jap;//国語の得点
    private int math;//数学の得点
    private int eng;//英語の得点

    //コンストラクタ

    public Student(String name, Gender gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    //個人合計
    public int sum() {
        return jap + math + eng;
    }

    //個人平均
    public double ave() {
        return sum() / 3.0;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d %.2f"
                ,name,gender.jpName,jap,math,eng,sum(),ave());
    }
}