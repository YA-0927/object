package basic.human5zibun;

//中国人クラス
class Chinese extends Human {
    public Chinese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("我的名字是" + name + "。");
    }
}



