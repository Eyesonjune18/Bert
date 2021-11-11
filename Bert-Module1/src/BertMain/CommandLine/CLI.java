package BertMain.CommandLine;

import java.util.Scanner;

public class CLI {

    public static boolean continueListening = true;

    public static void launch() {

        Scanner input = new Scanner(System.in);

        while(continueListening) {

            try {

                performCommand(input.nextLine());

            } catch(IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }

        }

    }

    private static void performCommand(String command) {



    }

}
