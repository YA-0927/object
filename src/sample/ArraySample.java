package sample;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArraySample {
    //配列の中身を合計する処理
    static int sum(int... array){
    int sum = 0 ;
    for (int value:array)sum += value;
    return sum;
    }
    public static void main(String[] args) {

        //配列のコピー
        int[] oldArray = {10, 20, 30};
        int[] newArray = Arrays.copyOf(oldArray,//元の配列
                oldArray.length + 3);//新しい長さ
                //oldArray.length - 2);マイナスを入れることで配列を短くできるが、配列自体を負の数にはできない

        //for命令を使わずに出来る配列の文字列表現
        System.out.println(Arrays.toString(oldArray));
        System.out.println(Arrays.toString(newArray));

        //配列のソート
        int[] array ={100,20,0,50,70};
        System.out.println(Arrays.toString(array));//ソート前
        Arrays.sort(array);//自然順にソート（昇順にソートでもよい）
        System.out.println(Arrays.toString(array));//ソート後
        //メソッドで降順には出来ない
        //objectの配列の進化版のソートを書き換えることで順序を変化することが出来る
        //一度並び替えてしまうと初期化していた元の並び順は喪失する。

        //値の探索
        int[] array1 ={2,4,7,1,8};
        Arrays.sort(array1);//事前にソートする
        //値7を検索（binarySearch＝検索する方法）
        System.out.println(Arrays.binarySearch(array1, 2));//1
        System.out.println(Arrays.binarySearch(array1,3));//負の数

        //可変長引数
        //引数の長さを変えることが出来る
        //型の後ろに...を書いて型の違うメソッドの引数で使うことが出来る。
        System.out.println(sum(1, 2, 3, 4));//10
        System.out.println(sum(10, 20));//30
    }
}
