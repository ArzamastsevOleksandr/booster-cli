package booster.cli.command.handler;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class CliCommandHandlers {

    private final Map<CliCommand, CliCommandHandler> handlerPerCommand;

    public CliCommandHandlers(Collection<CliCommandHandler> handlers) {
        handlerPerCommand = handlers.stream()
                .collect(Collectors.toMap(CliCommandHandler::command, h -> h));
    }

    public void handle(CliCommandParameters parameters) {
        handlerPerCommand.get(parameters.command()).handle(parameters);
    }

}
