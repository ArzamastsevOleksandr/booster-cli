package booster.cli.command.parameters.constructor;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;

public interface CliCommandParametersConstructor {

    CliCommandParameters construct(String input);

    CliCommand command();
}
