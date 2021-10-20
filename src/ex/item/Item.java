package ex.item;

import java.util.HashMap;
import java.util.Map;

class Item {
    private int id;
    private String name;
    private int price;

    //コンストラクタ
    public Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return   id + " " + name + " " + price ;
    }
}


