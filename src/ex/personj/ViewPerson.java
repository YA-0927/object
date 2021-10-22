package ex.personj;

import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ViewPerson {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.addAll(Arrays.asList(
                new Person("しむら", Gender.MEN,28),
                new Person("すどう", Gender.WOMEN,34),
                new Person("そのだ", Gender.WOMEN,21),
                new Person("さの", Gender.MEN,42),
                new Person("せがわ", Gender.WOMEN,55)
        ));

        //課題1
        System.out.println("課題1");
        for(Person person:persons){
            System.out.println(person);
        }

        //年齢降順
        Comparator<Person>ageReverseOrder = Comparator.comparing(Person::getAge,Comparator.reverseOrder());

        //課題2
        persons.sort(ageReverseOrder);
        System.out.println("課題2");
        persons.forEach(System.out::println);

        //課題3:男性のみ名前の昇順で並べ替えて表示しなさい。
        List<Person> manList = persons.stream().filter(person -> Gender.MEN.equals(person.getGender()))
                .collect(Collectors.toList());
        //名前昇順
        Comparator<Person>nameNaturalOrder = Comparator.comparing(Person::getName);
        persons.sort(nameNaturalOrder);
        System.out.println("課題3");
        manList.forEach(System.out::println);


        //課題4
        System.out.println("課題4");
        for(Person person : persons){
            if(person.getGender().equals(Gender.MEN)){

            }
        }


        System.out.println("男性の平均年齢：");
        System.out.println("女性の平均年齢：");


    }
}
