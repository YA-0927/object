package basic.human3;

class Italy extends Human {
    public Italy(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Buon giorno.Il mio nome è"+ name + ".");
    }
}
