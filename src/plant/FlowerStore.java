package plant;

import java.util.Arrays;

public class FlowerStore {
    private int wallet;

    public int getWallet() {
        return wallet;
    }

    public Flower[] sell(int countRose, int countChamomile, int countTulip) {

        Flower[] flowers = new Flower[countChamomile + countChamomile + countChamomile];
        Arrays.fill(flowers, 0, countRose, new Rose(this));
        Arrays.fill(flowers, countRose, countRose += countChamomile, new Chamomile(this));
        Arrays.fill(flowers, countRose, countRose + countTulip, new Tulip(this));
        return flowers;
    }

    public Flower[] sellSequence(int countRose, int countChamomile, int countTulip) {

        Flower[] flowers = new Flower[countRose + countChamomile + countTulip];
        for (int i = 0; i < flowers.length; ) {
            if (countRose > 0) {
                flowers[i++] = new Rose(this);
                countRose--;
            }
            if (countChamomile > 0) {
                flowers[i++] = new Chamomile(this);
                countChamomile--;
            }
            if (countTulip > 0) {
                flowers[i++] = new Tulip(this);
                countTulip--;
            }
        }
        return flowers;
    }

}
