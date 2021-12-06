package ex.exception;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOException {
    public static void main(String[] args) {
        byte[] contents = new byte[100];
        InputStream is = null;

        try{
            Path path = Path.of("c:\\text.txt");
            is = Files.newInputStream(path);
            is.read(contents);
        }catch (java.io.IOException e){
            System.out.println();
        }

    }
}
