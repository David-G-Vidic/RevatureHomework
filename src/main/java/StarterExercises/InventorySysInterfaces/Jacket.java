package StarterExercises.InventorySysInterfaces;

public class Jacket implements Item{

    private String name;
    private double price;
    private  int size;

    public Jacket(String name, double price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public int size() {
        return size;
    }
}
