package ex.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Temp1 {
    public static void main(String[] args) throws IOException {
        question1();
    }

    public static void question1() {
        String first = "./src/ex/file"; //指定した階層にファイル
        String fileName = "temp.txt";//この名前
        if (Files.notExists(Path.of(first,fileName))){//Existsなかったら作る
            try {
                Files.createFile(Path.of(first, fileName));
            }catch(java.io.IOException e){
                e.printStackTrace();
            }
        }
    }
}

