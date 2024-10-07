package booster.cli.command.parameters.constructor;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.impl.ShowSettingsParameters;
import org.springframework.stereotype.Component;

// ss
@Component
class ShowSettingsCommandParametersConstructor implements CliCommandParametersConstructor {

    @Override
    public CliCommandParameters construct(String input) {
        return new ShowSettingsParameters();
    }

    @Override
    public CliCommand command() {
        return CliCommand.SHOW_SETTINGS;
    }
}
