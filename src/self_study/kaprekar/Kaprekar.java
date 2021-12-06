package self_study.kaprekar;

import java.util.*;

class Kaprekar {
    //4桁のカプレカ数を求める
    public static void main(String[] args) {
        //ランダムで4桁の数字
        double random =Math.random()*10000;
        //double型をint型にキャスト
        int r = (int)random;
        System.out.println("生成された4桁の数字:" +r);

        //4桁の数値をそれぞれ分割
        String str = Integer.toString(r);
        String[] arrayStr = str.split("");
        //System.out.println("String型配列"+ Arrays.toString(arrayStr)); //表示して確認

        //整数にする
        int[] arrayInt = new int[arrayStr.length];
        for (int i = 0; i < arrayInt.length; i++) {
        }
        //昇順にする
        Arrays.sort(arrayStr);
        System.out.println("最小値配列"+ Arrays.toString(arrayStr));

        //最小値としてminに代入
        String minN = String.join("",arrayStr);
        System.out.println(minN);

        //最大値としてmaxに代入
        Collections.reverse(Arrays.asList(arrayStr));
        System.out.println("最大値配列"+ Arrays.toString(arrayStr));
        String maxN = String.join("",arrayStr);
        System.out.println(maxN);

        int max = Integer.parseInt(maxN);
        int min = Integer.parseInt(minN);

        int tempNum = max - min;
        int kaprelaNum = tempNum;

        System.out.println(" ");

        System.out.println("最大値－最小値：" + tempNum);

        //if(Kaprekar)
    }
}
