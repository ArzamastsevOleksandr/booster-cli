package booster.cli.command.handler;

import booster.cli.adapter.CliOutputWriter;
import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.impl.HelpCommandParameters;
import booster.cli.command.parameters.impl.SingleCommandParameters;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
class HelpCommandHandler implements CliCommandHandler {

    private final CliOutputWriter writer;

    @Override
    public void handle(CliCommandParameters parameters) {
        writer.println(parameters.toString());
        if (parameters instanceof SingleCommandParameters scp) {
            writer.println("Available commands:");
            writer.println();
            Arrays.stream(CliCommand.values())
                    .filter(command -> command != CliCommand.UNRECOGNIZED && command != CliCommand.EMPTY)
                    .forEach(command -> writer.println(command.name() + " [" + command.alias() + "]"));
            writer.println();
        } else {
            HelpCommandParameters helpCommandParameters = (HelpCommandParameters) parameters;
            writer.println("Implement help on " + helpCommandParameters.helpTarget());
        }
    }

    @Override
    public CliCommand command() {
        return CliCommand.HELP;
    }

}
