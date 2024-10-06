package booster.cli.command.parameters.constructor;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.impl.HelpCommandParameters;
import org.springframework.stereotype.Component;

@Component
class HelpCommandParametersConstructor implements CliCommandParametersConstructor {

    @Override
    public CliCommandParameters construct(String input) {
        return new HelpCommandParameters(CliCommand.HELP, CliCommand.from(input));
    }

    @Override
    public CliCommand command() {
        return CliCommand.HELP;
    }
}
