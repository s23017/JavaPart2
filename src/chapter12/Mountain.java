package chapter12;

public class Mountain {
    private String name;
    private int hight;

    public Mountain(String name, int hight) {
        this.name = name;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public int getHight() {
        return hight;
    }

    @Override
    public String toString() {
        return name + " " + hight;
    }
}
