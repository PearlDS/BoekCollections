public class BurgerOrder {
    private String name;
    private int number;

    public BurgerOrder() {
    }

    public BurgerOrder(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BurgerOrder{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
