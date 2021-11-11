package Archive;

//import java.util.ArrayList;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        launchBot();

    }

    private static void launchBot() {



    }

//    private static void quickStart() {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("""
//                Hi, I'm Bert. Before I start trading for you, please take a few moments to set up my parameters.
//                These parameters will influence the way I trade. I will decide most of my settings for myself,
//                but you may always fine-tune them in my config file (config.txt).
//                Firstly, what stock tickers do you want me to watch?
//                Enter the tickers in the form of a comma-separated list, like this: BTC-USD, ETH-USD, GOOG
//                If you make a mistake, don't worry, you can edit it afterwards.
//                """);
//        System.out.print("Enter your list of tickers here: ");
//
//        String tickerStringList = input.nextLine();
//        TickerList tickers = new TickerList(tickerStringList);
//        ArrayList<String> invalidTickers = tickers.getInvalidTickers();
//
//        if(invalidTickers.size() >= 1) {
//
//            System.out.println("I was unable to find stock tickers for the following entries: ");
//
//            for(int i = 0; i < invalidTickers.size(); i++) {
//
//                String t = invalidTickers.get(i);
//                System.out.print(t);
//                if(i < invalidTickers.size() - 1) System.out.print(", ");
//
//            }
//
//        }
//
//        boolean validTickersExist = false;
//
//        if(tickers.size() > 0) {
//
//            validTickersExist = true;
//
//            System.out.println("The following tickers have been added to my watchlist: ");
//
//            ArrayList<String> tickerFullNames = tickers.getAllFullTickerNames();
//
//            for(int i = 0; i < tickerFullNames.size(); i++) {
//
//                String n = tickerFullNames.get(i);
//                System.out.print(n);
//                if(i < tickerFullNames.size() - 1) System.out.print(", ");
//
//            }
//
//        }
//
//        boolean continueEditingTickers = false;
//
//        while(validTickersExist && !continueEditingTickers) {
//
//            System.out.println("Would you like to edit this list? (y/n): ");
//
//            if(input.nextLine() == "y")
//
//        }
//
//    }

}