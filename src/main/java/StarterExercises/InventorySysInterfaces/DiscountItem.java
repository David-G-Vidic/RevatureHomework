package StarterExercises.InventorySysInterfaces;

public class DiscountItem implements Item {

    private Item item;
    private double discountPercent;

    public DiscountItem(Item item, double discountPercentage) {
        this.item = item;
        this.discountPercent = discountPercentage;
    }

    @Override
    public String name() {
        return item.name();
    }

    @Override
    public double price() {
        return item.price() * (1 - discountPercent / 100);
    }

    @Override
    public int size() {
        return 0;
    }
}