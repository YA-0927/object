package basic.human3;

class HumanSample {
    public static void main(String[] args)  {
        Human tom =new Human("Tom");
        tom.sayHello();
        //sayHelloメソッドを記述していないのにプログラムが出てくる！
        //継承するとフィールドとメソッドはすべて（privateは継承しないけど）protectedは継承できる
        //JapaneseからHumanに書き換えることができた！＝配列することができる！
        Human Hiroshi = new Japanese("ひろし");
        Hiroshi.sayHello();

        Human Wan = new Chinese("王");
        Wan.sayHello();

        Human Kala = new Italy("Kara");
        Kala.sayHello();

        Human Soa = new Korea("서아");
        Soa.sayHello();

    }
}