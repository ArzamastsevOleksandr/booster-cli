package booster.cli.command.parameters.constructor;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.impl.AddSettingsParameters;
import org.springframework.stereotype.Component;

// as vp=5 np=2 vpbs=9
@Component
class AddSettingsCommandParametersConstructor implements CliCommandParametersConstructor {

    @Override
    public CliCommandParameters construct(String input) {
        // todo: implement
        return new AddSettingsParameters(1, 2, 3);
    }

    @Override
    public CliCommand command() {
        return CliCommand.ADD_SETTINGS;
    }
}
