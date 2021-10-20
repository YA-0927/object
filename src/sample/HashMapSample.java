package sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {
        //宣言
        Map<String,String> map = new HashMap<>(32);
        //（）の中に入力することでinitialCapacity（サイズ）で増やすことが出来る
        //要素の追加
        map.put("apple","りんご");
        map.put("pineapple","パイナップル");
        map.put("orange","オレンジ");
        //表示
        System.out.println(map); //{apple=りんご} キー＝値で出てくる
        //要素の取得
        System.out.println(map.get("apple"));//りんご
        //キーの集合を取得(今回はマップがストリング型なのでストリング)
        System.out.println(map.keySet());
        //値の集合の取得
        System.out.println(map.values());
        //キーと値を取得(MapクラスのEntry(Map.Entry)と書いて引き出す)
        //getKeyとgetValueで値を個別に取り出すことが出来る
        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //要素の削除(何を削除したか戻り値で返ってくる)
        System.out.println(map.remove("orange"));
        //要素の変更(何を変更したか戻り値で返ってくる)
        System.out.println(map.put("apple", "リンゴ"));
        //表示
        System.out.println(map);

        //キーによる検索(重要：containsKey)
        String searchWord = "orange";
        if (map.containsKey(searchWord)) {
            System.out.println(map.get(searchWord));
        }else{
            System.out.println("not find" + searchWord);
        }
    }
}
