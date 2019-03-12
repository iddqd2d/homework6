package plant;

public class Tulip extends Flower {
    public static final int COST = 45;

    Tulip(FlowerStore flowerStore) {
        super(flowerStore, COST);
    }
}
