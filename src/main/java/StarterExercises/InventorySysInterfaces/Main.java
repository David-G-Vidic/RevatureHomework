package StarterExercises.InventorySysInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Item blackJacket = new Jacket("BlackShock", 120.99, 15);
        Item blueJeans = new Jeans("DenimLooseFit", 45.89, 32);
        Item greyJeans = new Jeans("LeviGrey", 99.99, 33);
        List<Item> cart = new ArrayList<>();
        double totalPrice = 0;

        cart.add(blackJacket);
        cart.add(blueJeans);
        cart.add(greyJeans);

        Item discountedJeans = new DiscountItem(greyJeans, 30);
        cart.add(discountedJeans);

        for (Item i : cart){
            System.out.println(i.name()+": +$"+i.price());
            totalPrice += i.price();
        }
        System.out.println("Pre tax total: $"+totalPrice);
        System.out.println("MN state tax +$0.00");
        System.out.println("Total with tax: $"+totalPrice); //Mn clothing tax rate

    }
}
