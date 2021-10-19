package basic.inspection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ViewResult {
    public static void main(String[] args) {
        List<Result>results = new ArrayList<>();
        results.addAll(Arrays.asList(
                new Result("202010110910",
                        "山田太郎",
                        "20201-10-19T13:45:30",
                        36.4,
                        85,
                        122,
                        84)
        ));

        for (Result result:results) {
            System.out.println(result);
        }
    }
}
