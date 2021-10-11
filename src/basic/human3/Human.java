package basic.human3;

//継承
class Human {
    public static void main(String[] args) {
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
    //フィールド
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public void sayHello() {
        //Hello I'm自分の名前を表示するだけのメソッド
        //Tomを作ってTomにHelloと言わせているだけ
        System.out.println("Hello.I'm " + name + ".");
    }
    /*
    package basic.human3;

class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        Human[] humans = {
                new Human("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new French("Andrée")
        };
        //配列を利用して書き出すことができる

        for (Human human:humans) {
            human.sayHello();
        }
        //forで繰り返して呼び出すことができる（human型のインスタンスしかないから）
    }
}
     */
}