package self_study.kaprekar;

import java.util.*;

class Kaprekar {
    public static void main(String[] args) {
        //ランダムで4桁の数字
        double random = Math.random() * 10000;
        //double型をint型にキャスト
        int tempNum = (int) random;
        System.out.println("生成された4桁の数字:" + tempNum);

        //比較のためにkaprekarNumにtempNumを設定
        int kaprekarNum = tempNum;

        System.out.println("");

        //後判定繰り返し
        do {
            tempNum = kaprekarNum;
            //4桁の数値をそれぞれ分割
            String str = Integer.toString(tempNum);
            String[] arrayStr = str.split("");
            //System.out.println("String型配列"+ Arrays.toString(arrayStr)); //表示して確認

            //昇順にする
            Arrays.sort(arrayStr);
            //System.out.println("最小値配列" + Arrays.toString(arrayStr));

            //最小値としてminに代入
            String minN = String.join("", arrayStr);
            System.out.println("最小値" + minN);

            //最大値としてmaxに代入
            Collections.reverse(Arrays.asList(arrayStr));
            //System.out.println("最大値配列" + Arrays.toString(arrayStr));
            String maxN = String.join("", arrayStr);
            System.out.println("最大値" + maxN);

            int max = Integer.parseInt(maxN);
            int min = Integer.parseInt(minN);

            kaprekarNum = max - min;

            System.out.println("最大値－最小値：" + kaprekarNum);

            System.out.println(" ");
        }while(kaprekarNum != tempNum);

        System.out.println("∴カプレカ数："+ kaprekarNum );
    }
}
