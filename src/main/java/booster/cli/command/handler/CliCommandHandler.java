package booster.cli.command.handler;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;

interface CliCommandHandler {

    void handle(CliCommandParameters parameters);

    CliCommand command();
}
