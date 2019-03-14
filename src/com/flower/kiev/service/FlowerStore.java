package com.flower.kiev.service;

import com.flower.kiev.domain.Chamomile;
import com.flower.kiev.domain.Flower;
import com.flower.kiev.domain.Rose;
import com.flower.kiev.domain.Tulip;

import java.util.stream.Stream;


public class FlowerStore {
    private int balance;

    public int getbalance() {
        return balance;
    }

    public Flower[] sell(int countRose, int countChamomile, int countTulip) {
        return Stream.concat(
                Stream.concat(
                        Stream.generate(() -> new Rose()).limit(countRose),
                        Stream.generate(() -> new Chamomile()).limit(countChamomile)),
                Stream.generate(() -> new Tulip()).limit(countTulip)
        ).toArray(Flower[]::new);
    }

    public Flower[] sellSequence(int countRose, int countChamomile, int countTulip) {

        Flower[] flowers = new Flower[countRose + countChamomile + countTulip];
        for (int i = 0; i < flowers.length; ) {
            if (countRose > 0) {
                flowers[i++] = addBalance(new Rose());
                countRose--;
            }
            if (countChamomile > 0) {
                flowers[i++] = addBalance(new Chamomile());
                countChamomile--;
            }
            if (countTulip > 0) {
                flowers[i++] = addBalance(new Tulip());
                countTulip--;
            }
        }
        return flowers;
    }

    private Flower addBalance(Flower flower) {
        this.balance += flower.getCost();
        return flower;
    }

}
