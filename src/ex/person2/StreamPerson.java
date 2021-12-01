package ex.person2;

import sample.enumsample.Gender;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class StreamPerson {
    public static void main(String[] args) {
        List<Person>personList = new ArrayList<>(15);
        //使用していないMapは非表示
        //Map<Birthplace,List<Person>> birthplacePersonMap = new HashMap<>();

        //人物追加
        personList.addAll(Arrays.asList(
                new Person("やまだ",Birthplace.HOKKAIDO, Gender.MEN,35),
                new Person("いけだ",Birthplace.HOKKAIDO,Gender.WOMEN,26),
                new Person("いのうえ",Birthplace.FUKUOKA,Gender.MEN,32),
                new Person("たむら",Birthplace.FUKUOKA,Gender.WOMEN,22),
                new Person("わだ",Birthplace.TOKYO,Gender.MEN,42),
                new Person("くどう",Birthplace.TOKYO,Gender.WOMEN,55),
                new Person("さらど",Birthplace.OSAKA,Gender.MEN,31),
                new Person("あいざわ",Birthplace.OSAKA,Gender.WOMEN,44)
        ));

        //練習1
        System.out.println("練習1");
        //年齢が35歳以上の人の名前だけ表示
        personList.stream()//ストリーム生成
                .filter(p ->p.getAge() >= 35) //中間操作（pを渡す 35歳以上の人を取得）
                .forEach(p ->System.out.println( " " + p.getName())); //終端操作

        //練習2
        System.out.println("\n練習2");
        //年齢が35際未満の人
        personList.stream()
                .filter(p ->p.getAge() < 35 )
                .forEach(System.out::println);

        //課題1
        System.out.println("\n課題1");
        personList.stream()
                .forEach(System.out::println);

        //課題2
        System.out.println("\n課題2");
        personList.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        //課題3
        System.out.println("\n課題3");
        personList.stream()
                .filter( p ->p.getGender().equals(Gender.MEN))
                .forEach(System.out::println);

        //課題3-1
        System.out.println("\n課題3-1");
        personList.stream()
                .filter(p ->p.getGender().equals(Gender.WOMEN))
                .forEach(System.out::println);

        //課題4
        System.out.println("\n課題4");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .forEach(System.out::println);

        //課題4-1
        //年齢を昇順に並び替え
        System.out.println("\n課題4-1");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);

        //課題5
        //男性のみ名前を昇順
        System.out.println("\n課題5");
        personList.stream()
                .sorted(Comparator.comparing(Person::getName))
                .filter( p -> p.getGender().equals(Gender.MEN))
                .forEach(System.out::println);

        //女性のみ名前で降順
        System.out.println("\n勝手に");
        personList.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .forEach(System.out::println);

        //課題6
        System.out.println("\n課題6");
        List<String> nameList = personList.stream() //どのリストを使うか = パーソンリストのstreamを生成、代入
                .map(Person::getName) //パーソンクラスから名前をget
                .collect(Collectors.toList());//ここで名前リストを生成　toListでリストとしてnameListに名前を渡して
        nameList.forEach(System.out::println); //名前リストをリストとしてコンソールに表示

        //課題7
        //性別でグルーピングしたMAP（Gender,Person）を生成し、内容を表示
        System.out.println("\n課題7");
        Map<Gender,List<Person>> genderMap = personList.stream()//グルーピングに必要なリストを生成、genderMapに代入
                .collect(Collectors.groupingBy(Person::getGender));//PersonのgetGenderでグルーピング
        genderMap.entrySet().stream()//マップにセット
                .map(s ->s.getKey().getJpName()+"：" + s.getValue())//Genderをキーにしてその名前を取ってくる。セミコロンで分けそのデータを出力。
                .forEach(System.out::println);

        //課題8
        //男性で最年長の人を表示
        System.out.println("\n課題8");
        Optional<Person> person = personList.stream()//戻り値がullかもしれないときに使う
                .filter( p ->p.getGender().equals(Gender.MEN))
                .max(Comparator.comparing(Person::getAge));//教科書168P
        person.ifPresent(p -> System.out.println(p));//Optionalが入ってる時にifPresentで出力を指定

        //課題9
        System.out.println("\n課題9");
        Optional<Person> person1 = personList.stream()
                .filter(p ->p.getGender().equals(Gender.WOMEN))
                .min(Comparator.comparing(Person::getAge));
        person1.ifPresent(p -> System.out.println(p));

        //課題10
        System.out.println("\n課題10");
        //女性の平均年齢
        OptionalDouble womenAveAge =personList.stream() //personList.streamを作成し、womenAveAgeに代入
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .mapToDouble(Person::getAge) //ここでは前回の課題8ではnullがもし帰ってくるかもしれないからOptionalを使っていたが、MapToIntを使うことでInt型に変換することによってnullが入って来なくなる
                .average();
        womenAveAge.ifPresent(a -> System.out.println("女性の平均年齢："+a));




        //課題11
        System.out.println("\n課題11");
        OptionalDouble menAveAge = personList.stream()
                .filter(p ->p.getGender().equals(Gender.MEN))
                .mapToInt(Person::getAge)
                .average();
        menAveAge.ifPresent(a -> System.out.println("女性の平均年齢："+a));
    }
}