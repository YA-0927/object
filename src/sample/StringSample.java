package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSample {
    public static void main(String[] args) {
        String word1 = "aaaa";
        //文字列の結合 concat
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html
        System.out.println(word1.concat("bbb"));//aaaabbb

        //文字列の分割 split
        String sentence = "1-1,いのうえ,80,70,95";
        String[] data = sentence.split(",",6);
        System.out.println(Arrays.toString(data));

        //文字列の結合 join
        String joinWord =String.join(" ",data);
        System.out.println(joinWord);

        //文字列の置換 replace
        String original = "This is a pen.";
        System.out.println(original);
        String replace = original.replace("is","at");
        System.out.println(replace);

        //文字列の位置を検索する indexOf
        sentence = "This is a pen.";
        int index = sentence.indexOf("is");
        System.out.println(index);//2　最初に見つかったis
        int lastIndex = sentence.lastIndexOf("is");
        System.out.println(lastIndex);

        //その文章内に文字列が含まれるか contains
        boolean containsIndex = sentence.contains("is");
        System.out.println(containsIndex);
        //startsWithもある(接頭語があるか/戻り値：boolean型)
    }
}
