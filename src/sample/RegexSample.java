package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {
    public static void main(String[] args) {
        //郵便番号の正規表現
        //^キャレット（開始記号）/[0-9の数字]を{3回繰り返す}$終止記号
        String regex = "^[0-9]{3}-[0-9]{4}$";
        String zip1 = "064-0809";
        System.out.println(zip1.matches(regex));//true
        String zip2 = "0000-000";
        System.out.println(zip2.matches(regex));//false

        //正規表現の準備
        Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
        Matcher matcher = null;
        List<String>zipList =List.of("064-0809","0000-888");

        //比較を行う
        for (String zip:zipList){
            matcher = pattern.matcher(zip);
            if (matcher.matches()) {
                System.out.println(zip + ":ok");
            }else{
                System.out.println(zip+":ng");
            }
        }
    }
}

