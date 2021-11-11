package BertMain.CommandLine.Commands;

import BertMain.CommandLine.Command;

public class Help implements Command {

    private String arguments;

    public Help(String arguments) {

        this.arguments = arguments;

    }

    public void execute() {

        System.out.println("""
                If you would like help with a specific command, just enter "<command> ?"
                Here is a list of all the commands you can perform:
                <> = mandatory argument [] = optional argument
                add-ticker <ticker>
                 - Adds a ticker to the watchlist
                remove-ticker <ticker>
                 - Removes a ticker from the watchlist
                list-tickers
                 - Lists the tickers that are currently on the watchlist
                show-watchlist
                 - Shows the current watchlist and general info about each stock
                buy <ticker> <amount>
                 - Manually buys a certain amount of a stock, assuming sufficient funds
                sell <ticker> <amount>
                 - Manually sells a certain amount of a stock, assuming sufficient stock
                price <ticker> [time | MM/DD/YYYY HH:MM]
                 - Shows the current buy and sell price of a stock, or the price from a specified time
                pause
                 - Pauses all automatic trading
                unpause
                 - Unpauses automatic trading
                start
                 - Starts the bot using the most recently saved config file
                load <filename.txt>
                 - Starts the bot using the specified config file
                stop
                 - Stops the bot completely and saves the current configuration to a file
                verbose [on/off]
                 - Toggles verbose logging of trading and evaluation events
                enable-logging
                 - Enables verbose file logging
                disable-logging
                 - Disables verbose file logging
                quick-start
                 - Starts a setup wizard for easy first-time configuration
                """);

    }

}
