package sample.enumsample;

public enum Gender {
    //もっとも簡単な列挙型（本来はフィールドがある部分に拡張していく）
    //いか2点は”列挙名”という
    //（列挙）定数は大文字で書くのは暗黙の了解
    MEN("男"),
    WOMEN("女");
    //swich文を列挙型を書くこともある

    private String jpName;

    Gender(String jpName) {
        this.jpName = jpName;
    }
    //コンストラクタを作ったので上記の列挙名にフィールド名が必要になる
    //コンストラクタを書いたときにpublicが付いてこなくなる＝列挙型には必要ないので仕様として入力されない
    //MEN、WOMENに対してフィールド名が付いている
    //定数名のところにカッコを書いてフィールド名を書いてあげる

    //列挙名を男、女で呼び出せないのでゲッタを作り呼び出せるようにする
    //呼び出すときには列挙名+jpNameになるので後ほど変更
    public String getJpName() {
        return jpName;
    }
}
