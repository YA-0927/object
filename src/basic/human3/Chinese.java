package basic.human3;

class Chinese extends Human {
    public Chinese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("你好。我的名字是"+name+"。");
    }
}

