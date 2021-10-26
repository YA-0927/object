package ex.bmi;

import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberSample {
    public static void main(String[] args) {
        List<Member> members =new ArrayList<>();
        members.addAll(Arrays.asList(
                new Member("山田花子", Gender.WOMEN,12,1.30,30),
                new Member("佐藤一郎", Gender.MEN,21,1.72,60),
                new Member("源頼朝", Gender.MEN,25,1.80,75),
                new Member("細川ガラシャ", Gender.WOMEN,28,1.65,50),
                new Member("巴御前", Gender.WOMEN,30,1.68,58)
        ));

        for (Member member:members){
            System.out.println(member);
        }
    }
}
