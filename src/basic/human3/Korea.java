package basic.human3;

public class Korea extends Human {
    public Korea(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("안녕하세요.제 이름은 "+name+" 입니다.");
    }
}
