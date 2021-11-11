package BertMain;

public class PrivateAPI {

    public static boolean checkIfValidStock(String ticker) {

        //PSCODE:
        //query public API to find stock ticker
        //unless there is an error return true
        //else return false

        return true;

    }

    public static String resolveFullName(String ticker) {

        //PSCODE:
        //query public API to find stock full name
        //unless there is an error return name
        //else throw IllegalArgumentException

        return "The " + ticker;

    }

    public static double resolveBuyPrice(String ticker) {

        //PSCODE:
        //query public API to find stock buy price
        //unless there is an error return price
        //else throw IllegalArgumentException

        return 1001;

    }

    public static double resolveSellPrice(String ticker) {

        //PSCODE:
        //query public API to find stock sell price
        //unless there is an error return price
        //else throw IllegalArgumentException

        return 1000;

    }

}