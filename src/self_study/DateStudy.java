package self_study;

import java.util.Date;

public class DateStudy {
    public static void main(String[] args) {
        //現在時刻でDateクラスを生成
        Date now = new Date();
        System.out.println(now);

        //時刻を指定してDateクラスのインスタンスを生成
        //1970年1月1日午前0字（GMT）から500ミリ秒経した時刻
        Date date = new Date(5000);
        System.out.println(date);


    }
}
