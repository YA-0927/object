package basic.figure3;

class Rectangle implements IfGetArea{
    //フィールド
    private double height;
    private double width;

    //コンストラクタ
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }


    @Override
    public String toString() {
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
        //https://java-code.jp/173
        return String.format
                ("長方形 高さ:%.2f 幅:%.2f 面積:%.2f",
                        //画面に表示される文字列（.2＝少数型で表示しなさい）この行が下の行の変数に置き換わる
                        //ここで%.2fと打ってると小数第三位以下で四捨五入してくれる(round関数が不要)
                        //文字列型だったら%sに代わる…
                height,width,getArea());
    }

    @Override
    public double getArea() {
        return width*height ;
    }
}