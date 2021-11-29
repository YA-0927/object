package ex.inventory;

import ex.personj.Person;

import java.util.*;

public class ViewStock {//在庫表示

    public static void main(String[] args) {
        List<PersonalComputer> personalComputerList = new ArrayList<>();
        Map<String, List<PersonalComputer>> personalComputerMap = new HashMap<>();

        personalComputerList.addAll(Arrays.asList(
                new PersonalComputer("やまだ", 1, 1, 128, Constants.BIT64, Constants.WINDOWS_10),
                new PersonalComputer("いけだ", 2, 1, 128, Constants.BIT64, Constants.WINDOWS_11),
                new PersonalComputer("いのうえ", 3, 1, 500, Constants.BIT64, Constants.WINDOWS_11),
                new PersonalComputer("たむら", 4, 2, 128, Constants.BIT32, Constants.MAC),
                new PersonalComputer("わだ", 5, 2, 500, Constants.BIT32, Constants.WINDOWS_10),
                new PersonalComputer("くどう", 6, 2, 256, Constants.BIT64, Constants.MAC),
                new PersonalComputer("さらど", 7, 3, 256, Constants.BIT32, Constants.WINDOWS_10),
                new PersonalComputer("あいざわ", 8, 3, 500, Constants.BIT32, Constants.MAC)
        ));

        for (PersonalComputer personalComputer : personalComputerList) {
            if (personalComputerMap.containsKey(personalComputer.getOS())) {
                personalComputerMap.get(personalComputer.getOS()).add(personalComputer);
            } else {
                List<PersonalComputer> list = new ArrayList<>();
                list.add(personalComputer);
                personalComputerMap.put(personalComputer.getOS(), list);
            }
        }        //分類できたか表示
        for (Map.Entry entry : personalComputerMap.entrySet()) {
            System.out.println(entry.getKey());
            for (PersonalComputer personalComputer : (List<PersonalComputer>) entry.getValue())
                System.out.println(personalComputer);
        }
    }
}