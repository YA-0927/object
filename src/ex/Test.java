package ex;

public class Test {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;i <100;i+=3){
            if(i%2==0) continue;
            if(sum>50)break;
            sum +=i;
        }
        System.out.println(sum);

        byte[][] blocks = new byte[100][512];
        System.out.println(blocks[0].length);


    }







}
