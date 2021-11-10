package BertAlternate;

import java.util.ArrayList;

public class Watchlist {

    private ArrayList<Stock> stocks;
    private ArrayList<String> invalidTickers;

    public Watchlist(String tickerList) {

        generateStocks(separateTickerList(tickerList));

    }

    private String[] separateTickerList(String tickerList) {

        return tickerList.split(",");

    }

    private void generateStocks(String[] tickers) {

        for(String ticker : tickers) {

            try {

                stocks.add(new Stock(ticker));

            } catch(IllegalArgumentException e) {

                invalidTickers.add(ticker);

            }

        }

    }

}