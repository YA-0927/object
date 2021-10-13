package basic.human5zibun;

class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        Human[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new French("Andrée")
        };

        for (Human human:humans) {
            human.sayHello();
        }
    }
}