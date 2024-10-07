package booster.cli.command.parameters.constructor;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.impl.UnrecognizedCommandParameters;
import org.springframework.stereotype.Component;

@Component
class UnrecognizedCommandParametersConstructor implements CliCommandParametersConstructor {

    @Override
    public CliCommandParameters construct(String input) {
        return new UnrecognizedCommandParameters(input);
    }

    @Override
    public CliCommand command() {
        return CliCommand.UNRECOGNIZED;
    }
}
