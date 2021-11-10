package BertAlternate.CLI;

import BertAlternate.CLI.Commands.*;

public class CommandFactory {

    public static Command resolveCommand(String userEntry) {

        String command = getCommand(userEntry).toLowerCase();
        String arguments = getArguments(userEntry).toLowerCase();

        return switch(command) {

            case "help" -> new Help(arguments);
            case "add-ticker" -> new AddTicker(arguments);
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