package plant;

import java.lang.reflect.Field;

public class Rose extends Flower {
    public static final int COST = 100;

    Rose(FlowerStore flowerStore) {
        super(flowerStore, COST);
    }
}
