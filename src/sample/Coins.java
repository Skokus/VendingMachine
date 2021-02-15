package sample;

public class Coins {

    private Coin[] coins;
    private int[] counters;
    public int limit; //one limit for all counters

    public Coins(Coin[] coins){
        this.coins = coins;
        this.counters = new int[coins.length];
        this.limit = 10;
    }

    public Coins(Coin[] coins, int[] counters, int limit){
        this.coins = coins;
        this.counters = counters;
        this.limit = limit;
    }

}
