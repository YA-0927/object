package ex.human5;

import basic.human5.IfSayHello;

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