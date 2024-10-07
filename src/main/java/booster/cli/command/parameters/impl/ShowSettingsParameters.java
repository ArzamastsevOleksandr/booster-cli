package booster.cli.command.parameters.impl;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;

public record ShowSettingsParameters() implements CliCommandParameters {
    @Override
    public CliCommand command() {
        return CliCommand.SHOW_SETTINGS;
    }
}
