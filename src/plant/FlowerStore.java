package plant;

import java.util.Arrays;

public class FlowerStore {
    private int wallet;

    public int getWallet() {
        return wallet;
    }

    public Flower[] sell(int countRose, int countChamomile, int countTulip) {
        calculateWallet(countRose, countChamomile, countTulip);

        Flower[] flowers = new Flower[countChamomile + countChamomile + countChamomile];
        Arrays.fill(flowers, 0, countRose, new Rose());
        Arrays.fill(flowers, countRose, countRose += countChamomile, new Chamomile());
        Arrays.fill(flowers, countRose, countRose + countTulip, new Tulip());
        return flowers;
    }

    public Flower[] sellSequence(int countRose, int countChamomile, int countTulip) {
        calculateWallet(countRose, countChamomile, countTulip);

        int temp = countRose + countChamomile + countTulip;
        Flower[] flowers = new Flower[temp];
        for (int i = 0; i < flowers.length; ) {
            if (countRose > 0) {
                flowers[i++] = new Rose();
                countRose--;
            }
            if (countChamomile > 0) {
                flowers[i++] = new Chamomile();
                countChamomile--;
            }
            if (countTulip > 0) {
                flowers[i++] = new Tulip();
                countTulip--;
            }
        }
        return flowers;
    }

    public void calculateWallet(int countRose, int countChamomile, int countTulip) {
        this.wallet += countRose * Rose.COST + countChamomile * Chamomile.COST + countTulip * Tulip.COST;
    }

}
