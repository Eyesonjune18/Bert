package BertMain;

public class Stock {

    private final String ticker;
    private final int amount;
    private int currentBuyPrice;
    private int currentSellPrice;
    private final int originalBuyPrice;
    private final int originalSellPrice;
    private int currentEvaluation;
    private int originalEvaluation;

    public Stock(String ticker, int amount, int originalEvaluation) {

        this.ticker = ticker;
        this.amount = amount;
        this.originalBuyPrice = PrivateAPI.getBuyPrice(ticker, amount);
        this.originalSellPrice = PrivateAPI.getSellPrice(ticker, amount);
        this.currentBuyPrice = originalBuyPrice;
        this.currentSellPrice = originalSellPrice;
        this.originalEvaluation = originalEvaluation;
        this.currentEvaluation = originalEvaluation;

    }

    public void buy() {



    }

    public void sell() {



    }

}