package ex.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp3 {
    public static void main(String[] args) throws IOException {
        question3();
    }

    public static void question3() {
        String first = "./src/ex/file";
        String fileName = "temp.txt";
        Path path = Path.of(first, fileName);
        if (Files.notExists(path)) {
            System.out.println("読み込み対象のファイルがありません");
            try {
                Files.lines(path)
                        .forEach(System.out::println);
            } catch (java.io.IOException e) { //例外処理も記載
                e.printStackTrace();
            }
        }
    }
}
