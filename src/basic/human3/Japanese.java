package basic.human3;

//日本人クラス
//クラス名の後にextendsを入力することでSuperclassが作られる！
//こうすることで継承クラスで継承できるメソッドをすべて継承する
class Japanese extends Human{

    public Japanese(String name) {
        super(name);

        /*
        human(name)と同じ、自分のクラスのインスタンスとして利用可能。
        継承してもコンストラクトは必要。
        コンストラクタと一致している部分に関しては継承として利用可能。
         */
    }

    //機能を変更することができる！
    //Ctrl+OでOverrideできる一覧が出てくる（sayHelloは使用しているのでもう選択できない）
    @Override
    public void sayHello() {
        System.out.println("こんにちは、私の名前は"+ name +"です");
    }
}