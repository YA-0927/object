package self_study;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class CalenderStudy {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("■Calenderの値");
        System.out.println(calendar);
        System.out.println("■getTimeの値");
        System.out.println(calendar.getTime()+"\n");
        /*
        カレンダーは抽象クラス。
        そのためコンストラクタで呼び出すのではなく、例のようにgetInstanceメソッドを用いてインスタンスを取得する。
        処理の現場ではgetInstanceを生成すると出力結果が煩雑になる為、getTimeメソッドのみを用いるのが一般的。
         */

        //教科書270P
        //※カレンダークラスでの作成は変数名が被るため省略
        //分だけ指定する
        calendar.set(Calendar.MINUTE,18);
        System.out.println("分の指定：" + calendar.getTime());
        //全部指定する（月は0～11であらわすことに注意）
        calendar.set(2013,9,22,18,36,42);
        System.out.println("全部指定："+ calendar.getTime());
        //日を表示する
        System.out.println("日を表示する："+calendar.get(Calendar.DATE));
        //秒を表示する
        System.out.println("秒を指定する："+calendar.get(Calendar.SECOND));
        //年を2追加する（2年後の日時に変更する）
        calendar.add(Calendar.YEAR,2);
        System.out.println("年の加算："+calendar.getTime());
        //月を2減らす（2か月後の日時に変更する）
        calendar.add(Calendar.MONTH,-2);
        System.out.println("月の減算："+calendar.getTime()+"\n");


        //Date and Time APIを用いた書き方
        System.out.println("Date and Time APIを用いた書き方");
        //日付
        LocalDate date = LocalDate.now();
        System.out.println(date);
        //時刻
        LocalTime time = LocalTime.now();
        System.out.println(time);
        //日時
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        //教科書276P
        //現在時刻の指定
        System.out.println(LocalDateTime.now());
        //教科書267P～268Pを跨ぐ表に関してはofを使い年月日時分を指定する為のメソッド
        //例（秒数未満は省略可）
        System.out.println(LocalDateTime.of(2017, Month.JANUARY,1,1,23,45));
        System.out.println(LocalDateTime.of(2017, 1,1,1,23,45,678_000_000)+"\n");
        //※Calenderメソッドとは違い月を1～12で指定できる

        //日付文字列の指定
        //parseメソッドを用いる
        //うまくいかなかったので省略

        //Date and APIではgetを用い、年月日の各フィールドの値を個別に取得するメソッドが利用できる。（教科書278P）
        dateTime = LocalDateTime.of(2017,Month.JANUARY,2,3,45,6,890_000_000);
        System.out.println("年      ："+dateTime.getYear());
        System.out.println("月(Enum)："+dateTime.getMonth());
        System.out.println("月(数字) :"+dateTime.getMonthValue());
        System.out.println("日      ："+dateTime.getDayOfMonth());
        System.out.println("時      ："+dateTime.getHour());
        System.out.println("分      ："+dateTime.getMinute());
        System.out.println("秒      ："+dateTime.getSecond());
        System.out.println("ナノ秒   ："+dateTime.getNano()+"\n");

        //279P-280P
        dateTime = LocalDateTime.of(2017,2,3,21,30,15);
        //3日後
        System.out.println("年月日の計算");
        System.out.println("3日後  ："+dateTime.plusDays(3));
        //100日前
        System.out.println("100日前："+dateTime.minusDays(100));
        //30秒前
        System.out.println("30秒前 ："+dateTime.minusSeconds(30));
        //元インスタンスの作成
        System.out.println("元の値  ："+dateTime.plusDays(3)+"\n");

        //日付クラスを任意の形式で文字列出力
        System.out.println("任意の形で文字列出力");
        //教科書のdate変数を利用できないためdate1で代用
        //java.text.Simple.Date.FormatクラスのFormatメソッドを使用
        Date date1 = new Date();
        DateFormat format = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 時 mm 分 ss 秒 ");
        System.out.println(format.format(date1));

        //文字列で表現された日付をDateクラスに変換する
        //DateFormatの生成は省略
        try{
            Date date2 = format.parse("2017 年 01 月 01 日 01 時 23 分 45 秒 ");
            System.out.println(date2);
        }catch (ParseException ex){
            System.out.println("パースエラー");
        }

        //DateFormatクラスの使いまわしは同時に利用された場合に想定しない値が返ってくるので危険。絶対にやってはいけない。
        //開発の現場では「日付を定数として保持し、変換を行う直前でDateFormatクラスのインスタンスを生成して利用する」という方法をとる

        //285P
        //Date and APIで日付/次官クラスと文字列を相互変換する
        //日付/時間クラスを任意の形式で文字列出力する
        //LocalDateTimeクラスなどのDate and Time　APIのクラスを用いるときはDateFormatではなくDateTimeFormatterを用いる
        //ofPatternメソッドはstaticメソッド
        System.out.println("\n日付/時間クラスを任意の形式で文字列出力する");
        LocalDateTime date3 = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS")
                .format(date3));

        //日付/時間クラスで定義されてない値を文字列の形式に指定した場合は例外が発生するため注意
        //下例：日付オブジェクトを時間も含めた形式に変換しようとすると、UnsupportedTemporalTypeExceptionが発生する
        //※Dateクラスは年月日を引っ張ってくるクラス
        /*
        LocalDate date2 = LocalDate.now();
        System.out.println(DateTimeFormatter
        .ofPattern("yyyy/MM/dd HH:mm:ss.SSS")
                .format(date2));
         */

        //文字列で表現された日付を日付/時間クラスに変換する際もDateFormatクラスを用いる
        //formatメソッドではなくparseメソッドを使用する
        TemporalAccessor parsed = DateTimeFormatter
                .ofPattern("yyyy/MM/dd HH:mm:ss")
                .parse("2017/02/25 19:09:59");
        LocalDateTime date4 = LocalDateTime.from(parsed);
        System.out.println(date4);
        //parseメソッドの戻り値の型はTemporalAccessorインタフェースとなっているが、このままでは扱いづらいためLocalDateTimeクラス等に変換する
        //変換するには変換したいクラスのformatメソッドを用いる
        //日付のみの文字列をTemporalAccessorインタフェースを変換したものを時刻を含むLocalDateTimeクラスに変換しようとすると、DateTimeExceptionが発生する
        //また、変換元の文字列の形式が、ofPatternメソッドで指定した形式と一致していない場合、DateTimeParseExceptionが発生する

        //　286P
        // DateTimeFormatterはスレッドセーフの為インスタンスを使いまわすことが出来る。

        System.out.println("\n和暦に対応する");
        //java.time.chrono.JapaneseDateクラスを使用すると西暦を和暦に変換できる
        JapaneseDate date5 = JapaneseDate.of(2017,2,4);
        System.out.println(date5);

        //java.time.chrono.JapaneseEraクラスを用いることで和暦を指定して日付インスタンスを生成出来る
        JapaneseDate date6 = JapaneseDate.of(JapaneseEra.HEISEI,29,2,4);
        System.out.println(date6);

        //以下コードは126行目と設定が重複しエラーを吐く為DateStudy2にて出力。
        //→直った(printlnと思い\nと入力したところがparseメソッドの中だった模様)
        JapaneseDate date7 = JapaneseDate.of(2017,2,4);
        System.out.println(DateTimeFormatter
        .ofPattern("GGGG y 年 M 月 d 日")
        .format(date7));
    }
}
