package sample.enumsample;

class HumanSample {
    public static void main(String[] args) {
        //第二引数が男と書く形ではなくなる
        Human human1 = new Human("Tom",Gender.MEN,28);
        Human human2 = new Human("Saori",Gender.WOMEN,25);

        System.out.println(human1);
        System.out.println(human2);
        //あまり使用機会はないが覚えておく
        System.out.println(Gender.MEN.getJpName());//列挙名の取得
        System.out.println(Gender.WOMEN.getJpName());
        System.out.println(Gender.WOMEN.ordinal()) ;//列挙順（0から）//1//男だったらゼロ
    }
}
