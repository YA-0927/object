package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//ArrayListのサンプル
//よく使うものなので頻出される。覚えておく
//基本型は一切入らないのでラッパークラスしか自分が作ったクラスしか入らない
class ArrayListSample {
    public static void main(String[] args) {
        //宣言と初期化
        //Listが型宣言、整数を使いたいときはInteger、小数を使いたいときはDouble。文字列も書ける
        //ラッパークラスのみでの宣言
        //newArrayListはコンストラクタ
        //Listっていう名前のArrayListができただけ
        //
        List<Integer> list = new ArrayList<>();

        //初期化
        //一気に追加している、可変長にするときはこちらの方がいい
        //変数のみを書く
        list.addAll(Arrays.asList(20,10,40,30,50));

        //表示
        System.out.println(list);

        //要素の追加
        list.add(60);
        System.out.println(list);
        list.add(2,70);
        // 何番目に追加するか,何を追加するか
        // addメソッドのオーバーライド
        // list.で変換候補が出てくる。
        // 2つ出てくるが引数が一個のものは後ろに追加、引数が二個のものは上記のものが出てくる。
        System.out.println(list);

        //要素の上書き
        list.set(0,80);
        // 第一引数はリスト順、第二引数は何を入れるか。
        System.out.println(list);

        //要素の削除
        list.remove(2);
        //removeはよく出てくるので覚えておく
        System.out.println(list);

        list.removeAll(Arrays.asList(30,60));
        //要素が含まれていれば削除
        //retainALLで「選択したもの以外削除」
        System.out.println(list);

        //インデックスを指定して要素を取得
        //取得したいインデックスを入力
        System.out.println(list.get(3));

        //サイズ
        System.out.println(list.size());

        //一部の要素の取得
        //要素1から要素3の手前まで出力
        System.out.println(list.subList(1,3));

        //要素の消去
        //その要素は空ですか？っていうメソッド
        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());//true

        //ArrayListの初期化
        list.addAll(Arrays.asList(2,6,1,4,5,0,4));
        System.out.println(list);

        //値の検索
        //contains
        System.out.println(list.contains(6));//true 6はあるか？の意
        System.out.println(list.contains(10));//false 10はあるか？の意
        System.out.println(list.containsAll(Arrays.asList(1, 2, 4)));//true
        System.out.println(list.containsAll(Arrays.asList(1, 2, 3)));//false

        int num = 4;
        if (list.contains(num)){
            System.out.println(list.indexOf(num));//最初に見つけたインデックス
            System.out.println(list.lastIndexOf(num));//最後に見つけたインデックス
        }
        //インデックスを使いその番号を直接呼び出しに行くが実践的な使い方

        //ソート
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        // Comparator=比較関数　
        //
    }
}