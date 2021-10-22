package ex.person;

import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ViewPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.addAll(Arrays.asList(
                new Person("しむら", Gender.MEN,28),
                new Person("すどう",Gender.WOMEN,34),
                new Person("そのだ",Gender.WOMEN,21),
                new Person("さの",Gender.MEN,42),
                new Person("せがわ",Gender.WOMEN,55)
        ));

        //課題１
        System.out.println("課題１");
        for (Person person:personList) {
            System.out.println(person);
        }

        //課題２
        System.out.println("課題２");
        personList.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));
        for (Person person:personList) {
            System.out.println(person);
        }

        //課題３
        System.out.println("課題３");
        personList.sort(Comparator.comparing(Person::getName));
        for (Person person:personList) {
            if (person.getGender().equals(Gender.MEN)){
                System.out.println(person);
            }
        }

        //課題４
        System.out.println("課題４");
        int sumMen = 0,sumWomen = 0;
        double countMen = 0,countWomen = 0;
        for (Person person:personList) {
            if (person.getGender().equals(Gender.MEN)){
                countMen++;
                sumMen += person.getAge();
            } else {
                countWomen++;
                sumWomen += person.getAge();
            }
        }
        System.out.println(String.format("男性の平均年齢:%.1f",sumMen/countMen));
        System.out.println(String.format("女性の平均年齢:%.1f",sumWomen/countWomen));

        //課題５
        List<Person> menList = new ArrayList<>();
        List<Person> womenList = new ArrayList<>();

        for (Person person:personList) {
            if (person.getGender().equals(Gender.MEN)){
                menList.add(person);
            } else {
                womenList.add(person);
            }
        }

        System.out.println("課題５");
        menList.sort(Comparator.comparing(Person::getAge));
        womenList.sort(Comparator.comparing(Person::getAge));
        System.out.println("男性の最年長:" + menList.get(menList.size()-1));
        System.out.println("女性の最年長:" + womenList.get(womenList.size()-1));

    }
}
