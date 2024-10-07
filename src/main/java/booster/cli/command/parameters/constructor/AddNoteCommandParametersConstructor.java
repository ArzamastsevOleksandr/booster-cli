package booster.cli.command.parameters.constructor;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.impl.AddNoteParameters;
import org.springframework.stereotype.Component;

// an abra
@Component
class AddNoteCommandParametersConstructor implements CliCommandParametersConstructor {

    @Override
    public CliCommandParameters construct(String input) {
        return new AddNoteParameters(input);
    }

    @Override
    public CliCommand command() {
        return CliCommand.ADD_NOTE;
    }
}
