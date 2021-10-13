package sample;

//スーパークラスのサンプル
class SuperSample {
    protected int number;

    public SuperSample(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "SuperSample{" +
                "number=" + number +
                '}';
        //自動生成でこの形になる
        //コンストラクタは継承を使っても自動では生成されないので自分で入力するのを忘れず
    }
}

//継承のみのサブクラス
class SubSample1 extends SuperSample {
    public SubSample1(int number) {
        super(number);
    }
}

//フィールドとメソッドの追加とオーバーライドをしたサブクラス
class SubSample2 extends SuperSample {
    //追加したフィールド
    private String string;

    public SubSample2(int number, String string) {
        super(number);
        this.string = string;
    }

    //追加したメソッド
    public String getString() {
        return string;
    }

    //オーバーライドしたメソッド
    @Override
    public String toString() {
        return "SubSample2{" +
                "number=" + number +
                ", string='" + string + '\'' +
                '}';
    }
}

class InheritanceSample1 {
    public static void main(String[] args) {
        //スパークラスの型での宣言
        //SuperSample＝スーパークラスの名前（ほかの名前にもできる）
        SuperSample superSample = new SuperSample(10);
        SuperSample subSample1 = new SubSample1(10);
        SuperSample subSample2 = new SubSample2(10,"abc");
        //何のインスタンスかによって振る舞いが変わる

        //各インスタンスの振る舞い
        //振る舞いはどのクラスのインスタンスによるかで決まる
        System.out.println(superSample);
        System.out.println(subSample1);
        System.out.println(subSample2);

        //型による制約
        //型のクラスに存在しないメソッドは利用できない
        //＝スーパークラスに存在しないメソッドは利用できない
        SubSample2 subSample3 = (SubSample2) subSample2;
        //キャスト演算でSubSampleに型を変えることでやっと利用することができる

        //SubSample2型でないと追加されたメソッドは使用できない
        System.out.println(subSample3.getString());
    }
}