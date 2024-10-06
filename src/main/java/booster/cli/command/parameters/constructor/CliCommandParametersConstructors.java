package booster.cli.command.parameters.constructor;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

@Component
public class CliCommandParametersConstructors {

    private final Map<CliCommand, CliCommandParametersConstructor> constructorPerCommand;

    public CliCommandParametersConstructors(Collection<CliCommandParametersConstructor> constructors) {
        this.constructorPerCommand = constructors.stream()
                .collect(toMap(CliCommandParametersConstructor::command, c -> c));
    }

    public CliCommandParameters construct(CliCommand cliCommand, String parameters) {
        return constructorPerCommand.get(cliCommand).construct(parameters);
    }

}
