package basic.human5;

//フランス人クラス
class French implements IfSayHello {
    private String name;

    public French(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Je m'appelle " + name + ".");
    }
}