package basic.human5zibun;

//日本人クラス
class Japanese extends Human {

    public Japanese(String name) {
        super(name);//Human(name)と同じ
    }

    @Override
    public void sayHello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}