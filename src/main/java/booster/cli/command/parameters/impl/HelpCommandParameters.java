package booster.cli.command.parameters.impl;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;

public record HelpCommandParameters(CliCommand command, CliCommand helpTarget) implements CliCommandParameters {
}
