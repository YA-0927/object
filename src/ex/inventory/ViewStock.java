package ex.inventory;

import java.util.*;

public class ViewStock {//在庫表示(倉庫の在庫管理)

    public static void main(String[] args) {
        //配列初期化
        List<PersonalComputer> pcList = new ArrayList<>();

        //配列作成
        pcList.addAll(Arrays.asList(
                new PersonalComputer("やまだ",1,1,40000,Constants.BIT64,Constants.WINDOWS_10),
                new PersonalComputer("いけだ",2,1,90000,Constants.BIT64,Constants.WINDOWS_11),
                new PersonalComputer("いのうえ",3,1,80000,Constants.BIT64,Constants.WINDOWS_11),
                new PersonalComputer("たむら",4,2,120000,Constants.BIT32,Constants.MAC),
                new PersonalComputer("わだ",5,2,30000,Constants.BIT32,Constants.WINDOWS_10),
                new PersonalComputer("くどう",6,2,150000,Constants.BIT64,Constants.MAC),
                new PersonalComputer("さらど",7,3,40000,Constants.BIT32,Constants.WINDOWS_10),
                new PersonalComputer("あいざわ",8,3,70000,Constants.BIT32,Constants.MAC)
        ));

        //マップ初期化
        Map<Integer, ArrayList<Integer>> storagePriceMap = new HashMap<>();

        //Key：storageNo（倉庫の番号をキーにする）
        //value:Price
        for (PersonalComputer p : pcList) {
            int storageNo = p.getStorageNo();
            if (!storagePriceMap.containsKey(storageNo)) { //Mapの中に倉庫番号がキーとして入っているかどうか
                storagePriceMap.put(storageNo,new ArrayList<>()); //入っていなければここの処理
            }
            storagePriceMap.get(storageNo).add(p.getPrice());
        }
        //分類できたか表示（倉庫番号に対して値が表示されている）
        for (Map.Entry entry : storagePriceMap.entrySet()) {
            System.out.println("倉庫番号："+ entry.getKey()+":");
            System.out.println("PC金額：" + entry.getValue());
        }

        System.out.println("\n在庫内容の抽出");


        //マップを初期化
        Map<Integer,ArrayList<String>> osMap = new HashMap<>();

        //key=storageNo
        //value:OS
        for (PersonalComputer o : pcList) { //Personal～を型としてoを変数にしながらpcListから取り出す
            int storageNo = o.getStorageNo(); // oから取り出したgetStorageNo()をint
            if(!osMap.containsKey(storageNo)){
                osMap.put(storageNo,new ArrayList<>());
            }
            osMap.get(storageNo).add(o.getOS());
        }

        for (Map.Entry entry : osMap.entrySet()) {
            System.out.println("倉庫番号："+ entry.getKey()+":");
            System.out.println("在庫内容：" + entry.getValue());
        }

        //storagePriceMapから計算を行う
        System.out.println("\n//倉庫ごとの合計金額");
        for (Map.Entry entry : storagePriceMap.entrySet()){
            double sum = 0; //合計を入れる変数を定義する
            for (Integer i : (List<Integer>)entry.getValue()) {//これは「ListのInteger」と明示
                sum += i;
            }
            System.out.println("倉庫番号"+entry.getKey()+";");
            System.out.println("合計金額："+ sum +"円");
        }
        //合計台数を表示
        System.out.println("\n//倉庫ごとの合計台数");
        for (Map.Entry entry:storagePriceMap.entrySet()) {
        int cnt = ((List)entry.getValue()).size(); //合計台数を保存する変数cnt,要素数をカウントするメソッド.size
            System.out.println("倉庫番号"+entry.getKey()+";");
            System.out.println("合計台数：" + cnt +"台");
        }

        //倉庫別に1台語との平均金額を表示
        System.out.println("\n//倉庫内の一台ごとの平均金額");
        for(Map.Entry entry:storagePriceMap.entrySet()){
            double sum = 0;
            double cnt = ((List)entry.getValue()).size(); //合計台数を保存する変数cnt,要素数をカウントするメソッド.size
            for (Integer a : (List<Integer>)entry.getValue()){
                sum += a;
            }
            double ave = sum / cnt;
            System.out.println("倉庫番号："+ entry.getKey());
            System.out.println("平均金額：" + ave + "円");
        }
    }
}