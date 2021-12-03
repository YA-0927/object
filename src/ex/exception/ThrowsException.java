package ex.exception;

import java.io.IOException;

public class ThrowsException {
    static void readFile(String filepath)throws IOException{
        throw new IOException("ファイル：" + filepath +"がありませんでした");
    }
    //何らかのExceptionが発生する処理
    public static void main(String[] args) {
        try {
            readFile("c\\text.text");
            //,上記メソッド宣言時にthrows説が付いているので、呼び出し側で例外処理をする必要がある
        }catch(IOException e){
            System.out.println("ファイルの読み込みに失敗しました");
            e.printStackTrace();
        }
    }

}

