//package BertMain;
//
//import java.net.URL;
//
//public class Ticker {
//
//    private String tickerString;
//    private String tickerFullName;
//    private String tickerURL;
//
//    public Ticker(String userInputTickerString) {
//
//        if(!isValidTickerString(userInputTickerString)) throw new IllegalArgumentException("ERROR: This ticker is invalid");
//        tickerString = userInputTickerString;
//        tickerFullName = findFullName();
//        tickerURL = findURL();
//
//    }
//
//    private boolean isValidTickerString(String userInputTickerString) {
//
//        //PSCODE:
//        //try to connect to private API using userInputTickerString
//        //if the request fails, the ticker is invalid
//        //return false;
//
//        return false;
//
//    }
//
//    private String findFullName() {
//
//        //PSCODE:
//        //connect to private API using tickerString
//        //retrieve full name into string fullName
//        //return fullName
//
//        return "";
//
//    }
//
//    private String findURL() {
//
//        //PSCODE:
//        //connect to private API using tickerString
//        //retrieve URL into string URL
//        //return URL
//
//        return "";
//
//    }
//
//    public String getFullName() {
//
//        return tickerFullName;
//
//    }
//
//}