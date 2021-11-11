package BertMain.CommandLine;

import BertMain.CommandLine.Commands.*;

public class CommandFactory {

    public static Command resolveCommand(String userEntry) {

        String command = getCommand(userEntry).toLowerCase();
        String arguments = getArguments(userEntry).toLowerCase();

        return switch(command) {

            case "help" -> new Help(arguments);
            case "add-ticker" -> new AddTicker(arguments);
            case "remove-ticker" -> new RemoveTicker(arguments);
            case "list-tickers" -> new ListTickers(arguments);
            case "show-watchlist" -> new ShowWatchlist(arguments);
            case "buy" -> new Buy(arguments);
            case "sell" -> new Sell(arguments);
            case "pause" -> new Pause(arguments);
            case "unpause" -> new Unpause(arguments);
            case "start" -> new Start(arguments);
            case "load" -> new Load(arguments);
            case "stop" -> new Stop(arguments);
            case "verbose" -> new Verbose(arguments);
            case "enable-logging" -> new EnableLogging(arguments);
            case "disable-logging" -> new DisableLogging(arguments);
            case "quick-start" -> new QuickStart(arguments);
            default -> throw new IllegalArgumentException("The user has entered an invalid command");

        };

    }

    private static String getCommand(String fullCommand) {

        int spaceIndex = fullCommand.indexOf(" ");
        return fullCommand.substring(0, spaceIndex);

    }

    private static String getArguments(String fullCommand) {

        int spaceIndex = fullCommand.indexOf(" ");
        return fullCommand.substring(spaceIndex);

    }

}