package BertMain;

public class Stock {

    private final String ticker;
    private final String fullName;
    private double buyPrice;
    private double sellPrice;

    public Stock(String ticker) {

        PrivateAPI.checkIfValidStock(ticker);
        this.ticker = ticker;
        fullName = PrivateAPI.resolveFullName(ticker);
        buyPrice = PrivateAPI.resolveBuyPrice(ticker);
        sellPrice = PrivateAPI.resolveSellPrice(ticker);

    }

    public String getTicker() {

        return ticker;

    }

    public String getFullName() {

        return fullName;

    }

    public double getBuyPrice() {

        return buyPrice;

    }

    public double getSellPrice() {

        return sellPrice;

    }

    public void setBuyPrice(double buyPrice) {

        this.buyPrice = buyPrice;

    }

    public void setSellPrice(double sellPrice) {

        this.sellPrice = sellPrice;

    }

}