package ex.exception;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Exception1 {
    public static void main(String[] args) {
        int n[] = {1,2,3};
        System.out.println("開始");
        try{
            for (int i = 0; i < 6; i++) {
                System.out.println(n[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("配列の範囲を超えています");
        }finally{
            System.out.println("終了");
        }


    }
}
