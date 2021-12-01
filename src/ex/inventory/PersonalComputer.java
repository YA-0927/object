package ex.inventory;

public class PersonalComputer {//PC情報

    private String userName;
    private int pcNo;
    private int storageNo;
    private int price;
    private int bit;
    private String OS;

    public PersonalComputer(String userName, int pcNo, int storageNo, int price, int bit, String OS) {
        this.userName = userName;
        this.pcNo = pcNo;
        this.storageNo = storageNo;
        this.price = price;
        this.bit = bit;
        this.OS = OS;
    }

    public String getUserName() {
        return userName;
    }

    public int getPcNo() {
        return pcNo;
    }

    public int getStorageNo() {
        return storageNo;
    }

    public int getPrice() {
        return price;
    }

    public int getBit() {
        return bit;
    }

    public String getOS() {
        return OS;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d %d %s",
                userName,pcNo,storageNo, price,bit,OS);
    }
}
