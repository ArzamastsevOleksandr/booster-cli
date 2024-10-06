package booster.cli.command.handler;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import org.springframework.stereotype.Component;

@Component
class EmptyCommandHandler implements CliCommandHandler {

    @Override
    public void handle(CliCommandParameters parameters) {
        // Do nothing, resume the control flow ¯\_(ツ)_/¯
    }

    @Override
    public CliCommand command() {
        return CliCommand.EMPTY;
    }
}
