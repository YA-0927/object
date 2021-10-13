package sample;

interface IfTax {//static final～と同義
    double TAX = 0.1;
    long getTaxIncludedPrice();
}
class Item implements IfTax {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public long getTaxIncludedPrice() {
        return Math.round(price * (1 + TAX));
    }

    @Override
    public String toString() {
        return String.format("%s %d円（税込み） %d円（税抜き）",
                name,getTaxIncludedPrice(),price);
    }
}
class InterfaceSample {
    public static void main(String[] args) {
        Item item1 = new Item("とうふ",48);
        System.out.println(item1);
    }
}