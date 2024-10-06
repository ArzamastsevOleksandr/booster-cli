package booster.cli.launch;

import booster.cli.command.CliCommand;
import booster.cli.command.CliCommandContext;
import booster.cli.command.handler.CliCommandHandlers;
import booster.cli.adapter.CliInputReader;
import booster.cli.adapter.CliOutputWriter;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parser.CliInputParser;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CliLauncher {

    private final CliInputReader reader;
    private final CliOutputWriter writer;

    private final CliCommandHandlers handlers;

    private final CliInputParser parser;

    @Value("${spring.application.name}")
    private String appName;

    public void start() {
        writer.println("Welcome to " + appName + "!");
        writer.println("Type command or " + CliCommand.HELP.alias() + " to get help.");
        writer.println();

        CliCommandParameters parameters = cliCommandParameters();

        while (parameters.command() != CliCommand.EXIT) {
            handlers.handle(parameters);

            parameters = cliCommandParameters();
        }
    }

    private CliCommandParameters cliCommandParameters() {
        writer.prompt();
        String input = reader.readLine();
        return parser.parse(input);
    }

}
