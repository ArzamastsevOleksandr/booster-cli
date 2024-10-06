package booster.cli.command.handler;

import booster.cli.adapter.CliOutputWriter;
import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class UnrecognizedCommandHandler implements CliCommandHandler {

    private final CliOutputWriter writer;

    @Override
    public void handle(CliCommandParameters parameters) {
        writer.println("Command not supported!");
    }

    @Override
    public CliCommand command() {
        return CliCommand.UNRECOGNIZED;
    }
}
