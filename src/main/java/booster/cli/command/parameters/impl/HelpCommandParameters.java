package booster.cli.command.parameters.impl;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;

public record HelpCommandParameters(CliCommand helpTarget) implements CliCommandParameters {
    @Override
    public CliCommand command() {
        return CliCommand.HELP;
    }
}
