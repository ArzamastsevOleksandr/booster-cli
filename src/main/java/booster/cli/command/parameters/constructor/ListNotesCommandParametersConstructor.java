package booster.cli.command.parameters.constructor;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.impl.ListNotesParameters;
import org.springframework.stereotype.Component;

// ln 4
@Component
class ListNotesCommandParametersConstructor implements CliCommandParametersConstructor {

    @Override
    public CliCommandParameters construct(String input) {
        return new ListNotesParameters(Integer.parseInt(input));
    }

    @Override
    public CliCommand command() {
        return CliCommand.LIST_NOTES;
    }
}
