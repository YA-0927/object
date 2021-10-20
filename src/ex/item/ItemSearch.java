package ex.item;

import java.util.*;

public class ItemSearch {
    public static void main(String[] args) {

        //宣言
        Map<Integer, Item> map = new HashMap<>(32);

        //要素の追加
        map.put(1, new Item(1, "消しゴム", 100));
        map.put(2, new Item(2, "ボールペン", 120));
        map.put(3, new Item(3, "コンパス", 400));
        map.put(4, new Item(4, "定規", 200));
        map.put(5, new Item(5, "ノート", 140));
        map.put(6, new Item(6, "付箋", 480));
        map.put(7, new Item(7, "鉛筆", 500));

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

        //上のfor文は以下に書き直すことが出来る
        //map.values().forEach(System.out::println);
        /*
        map.values().stream()
                .sorted(Comparator.comparing(Item::getPrice,Comparator.reverseOrder()))
                .forEach(System.out::println);
        */

        int searchNo = 1;
        System.out.println("商品ID"+ searchNo +"による検索");
        if (map.containsKey(searchNo)) {
            System.out.println(map.get(searchNo));
        } else {
            System.out.println("該当商品" + searchNo+ "はありません");
        }


    }
}

