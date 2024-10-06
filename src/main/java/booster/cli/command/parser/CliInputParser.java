package booster.cli.command.parser;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.impl.EmptyParameters;
import booster.cli.command.parameters.impl.SingleCommandParameters;
import booster.cli.command.parameters.constructor.CliCommandParametersConstructors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CliInputParser {

    private final CliCommandParametersConstructors parametersConstructors;

    public CliCommandParameters parse(String input) {
        if (input.isBlank()) {
            return new EmptyParameters();
        }
        int firstSpace = input.indexOf(' ');
        if (firstSpace == -1) {
            return new SingleCommandParameters(CliCommand.from(input));
        }
        CliCommand cliCommand = CliCommand.from(input.substring(0, firstSpace));
        String parameters = input.substring(firstSpace).trim();

        return parametersConstructors.construct(cliCommand, parameters);
    }

}
