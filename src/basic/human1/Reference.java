package basic.human1;

//参照型のサンプル
class Reference {
    public static void main(String[] args) {
        Human human1 = new Human("Tom",28);
        Human human2 = human1;
        Human human3 = new Human(human1);//メモリ空間に新たなインスタンスを配置している

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        //リネーム
        human1.setName("John");

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        //参照型は完全な複製を作ってからコピーしないといけない…
        //シャロー型は違うものに同じ名前がついている状態…
        //新しいインスタンスとしてhuman3が作成された（新しい器を作ってデータが作成された）
    }
}
