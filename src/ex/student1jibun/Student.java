package ex.student1jibun;

public class Student {
    //生徒情報
    private String name;
    private  String gender;
    private int jap;
    private int math;
    private int eng;
    private int sum = jap + math +eng;


    //コンストラクタ
    public Student(String name, String gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    //ゲッタとセッタ
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getJap() {
        return jap;
    }

    public void setJap(int jap) {
        this.jap = jap;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    //三科目合計int

    public Student(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    //ストリングでのオーバーライド
    @Override
    public String toString() {
        return name + " " + gender+ " " + jap+ " "  + math+ " "  + eng + " "+ sum ;
    }


}
