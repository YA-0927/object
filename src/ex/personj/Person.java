package ex.personj;

import sample.enumsample.Gender;

public class Person {

    private String name;
    private Gender gender;
    private int age ;

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d",
                name , gender.getJpName() , age );
    }

    //女性の平均年齢
}
