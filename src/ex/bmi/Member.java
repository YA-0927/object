package ex.bmi;

import sample.enumsample.Gender;

class Member {
    //名前,性別.年齢,身長,体重,適正体重,体型
    private String name;
    private Gender gender;
    private int age;
    private double height;
    private double weight;

    public Member(String name, Gender gender, int age,double height, double weight) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    public double getBmi() {
        return getWeight() / Math.pow(getHeight(),2);
    }

    public double getAppWeight() {
        return Math.pow(getHeight(),2) * 22;
    }

    //体型の表示
    public String getBodyShape() {
        double bmi = getBmi();
        if (bmi >= 40) {
            return "判定：肥満(4度)";
        } else if(bmi >= 35) {
            return "判定：肥満(3度)";
        } else if(bmi >= 30) {
            return "判定：肥満(2度)";
        } else if(bmi >= 25) {
            return "判定：肥満(1度)";
        } else if(bmi >= 18.5) {
            return "判定：普通";
        } else {
            return "判定：低体重";
        }
    }

    @Override
    public String toString() {
        return String.format("名前：%s　性別：%s　年齢：%d　身長：%.2f　体重：%.2f　BMI：%.1f　適正体重：%.2f　体型：%s",
        name, getGender().getJpName(),age,height,weight,getBmi(),getAppWeight(),getBodyShape());
    }
}
