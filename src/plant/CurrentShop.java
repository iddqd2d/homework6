package plant;

import java.util.Arrays;

public class CurrentShop {
    public static void main(String[] args) {
        FlowerStore fs = new FlowerStore();
        System.out.println(Arrays.toString(fs.sell(5, 3, 1)));
        System.out.println(Arrays.toString(fs.sellSequence(5, 3, 1)));
    }
}
