package plant;

import java.lang.reflect.Field;

public class Flower {

    Flower(FlowerStore flowerStore, int cost){
        try {
            Field field = flowerStore.getClass().getDeclaredField("wallet");
            field.setAccessible(true);
            field.set(flowerStore, (Integer) field.get(flowerStore) + cost);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
