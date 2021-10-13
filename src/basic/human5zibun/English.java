package basic.human5zibun;

//中国人クラス
class English extends Human {
    public English(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello I`m" + name + ".");
    }
}