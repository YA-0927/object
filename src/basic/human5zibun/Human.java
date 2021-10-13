package basic.human5zibun;

//継承（スーパークラス）
public abstract class Human {
    //フィールド
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}

