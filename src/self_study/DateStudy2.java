package self_study;

import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class DateStudy2 {
    public static void main(String[] args) {
        JapaneseDate date7 = JapaneseDate.of(2017,2,4);
        System.out.println(DateTimeFormatter
                .ofPattern("GGGGy 年 M 月 d 日")
                .format(date7));
    }
}
