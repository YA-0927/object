
package ex.person2;

public enum Birthplace {
    HOKKAIDO("北海道"),
    TOKYO("東京"),
    OSAKA("大阪"),
    FUKUOKA("福岡");

    private  String name;

    Birthplace(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}