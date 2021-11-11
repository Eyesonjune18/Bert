//package BertMain;
//
//import java.util.ArrayList;
//
//public class TickerList {
//
//    private Ticker[] tickerArray;
//    private ArrayList<String> invalidTickers;
//
//    public TickerList(String userInputTickerStringList) {
//
//        invalidTickers = new ArrayList<>();
//        tickerArray = tickerStringListToTickerArray(userInputTickerStringList);
//
//    }
//
//    private Ticker[] tickerStringListToTickerArray(String tickerStringList) {
//
//        String[] tickerStringArray = tickerStringList.split(", *");
//        Ticker[] tickerArray = new Ticker[tickerStringArray.length];
//
//        int i = 0;
//
//        for(String stringTicker : tickerStringArray) {
//
//            try {
//
//                Ticker ticker = new Ticker(stringTicker);
//                tickerArray[i] = ticker;
//
//            } catch(IllegalArgumentException e) {
//
//                invalidTickers.add(stringTicker);
//
//            }
//
//            i++;
//
//        }
//
//        return tickerArray;
//
//    }
//
//    public ArrayList<String> getAllFullTickerNames() {
//
//        ArrayList<String> fullTickerNameList = new ArrayList<String>();
//
//        for(Ticker t : tickerArray) fullTickerNameList.add(t.getFullName());
//
//        return fullTickerNameList;
//
//    }
//
//    public ArrayList<String> getInvalidTickers() {
//
//        return invalidTickers;
//
//    }
//
//    public int size() {
//
//        return tickerArray.length;
//
//    }
//
//}
