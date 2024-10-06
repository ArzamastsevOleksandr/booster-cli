package booster.cli.command;

import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.impl.EmptyParameters;

public record CliCommandContext(CliCommand command, CliCommandParameters parameters) {

    public CliCommandContext(CliCommand command) {
        this(command, new EmptyParameters());
    }
}
