package sample;

import java.util.*;

public class HashSetSample {
    public static void main(String[] args) {

        //宣言(IntegerSetが代表的な宣言というだけでこうしないといけないわけじゃない)
        Set<Integer> integerSet = new HashSet<>();
        //追加
        integerSet.add(10);
        integerSet.addAll(Arrays.asList(20,30));
        System.out.println(integerSet);//10,20,30
        // 削除
        integerSet.remove(20);
        System.out.println(integerSet);//10,30
        //要素数
        System.out.println(integerSet.size());//2
        //空かどうか
        System.out.println(integerSet.isEmpty());//false
        //値の検索
        System.out.println(integerSet.contains(20));//false//10と30を探せばfalse
        //ArrayList空の変換
        List<Integer> integerList = new ArrayList<>(Arrays.asList(3,9,1,6,1));
        System.out.println("ArrayList:"+integerList);
        Set<Integer> integerLinkedHashSet = new LinkedHashSet<>(integerList);//変換//この時点で1が一つに（セットでは重複を許さないため）
        System.out.println("LinkedHashSet:" + integerLinkedHashSet);//追加順
        Set<Integer> integerTreeSet = new TreeSet<>(integerList);//変換//この時点で1が一つに（セットでは重複を許さないため）
        System.out.println("TreeSet:"+integerTreeSet);//昇順になる
        //TreeSet：データが常にソートされた状態に。追加されるたびにソートされる状態になるので他に比べて重い
        //LinkedHashSetは追加した順序を覚えている

    }
}