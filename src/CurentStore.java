import service.FlowerStore;

import java.util.Arrays;

public class CurentStore {
    public static void main(String[] args) {
        FlowerStore fs = new FlowerStore();
        System.out.println(Arrays.toString(fs.sell(5, 3, 1)));
        FlowerStore fs1 = new FlowerStore();
        System.out.println(Arrays.toString(fs1.sellSequence(5, 3, 1)));
        System.out.println(fs1.getbalance());
    }
}
