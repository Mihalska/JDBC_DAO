package task3;

import java.util.Objects;

public class Florist implements Comparable <Florist> {
    private String name;
    private int freshness;
    private int price;
    private String accessory;
    private int length;

    public Florist(String name, int price, int freshness, int length) {
        this.name = name;
        this.price = price;
        this.freshness = freshness;
        this.length = length;
    }

    public Florist(int price, String accessory) {
        this.accessory = accessory;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getFreshness() {
        return freshness;
    }

    public int getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }

    public String getAccessory() {
        return accessory;
    }

    @Override
    public int compareTo(Florist o) {

        if (this.name != null) {
            if (this.freshness != o.getFreshness()) {
                return this.freshness - o.getFreshness();
            }
            return this.name.compareTo(o.getName());
        }
        return 1;
    }

    @Override
    public String toString() {
        if (Objects.equals(name, "Роза") | Objects.equals(name, "Ромашка") | Objects.equals(name, "Лілія")| Objects.equals(name, "Орхідея") | Objects.equals(name, "Гортензія") | Objects.equals(name, "Іріс") ) {
            return  name + " рівень свіжості =  " + freshness;

        }
        return "";
    }
}

