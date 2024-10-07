package booster.cli.command.handler;

import booster.cli.adapter.CliOutputWriter;
import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.config.Settings;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class ShowSettingsCommandHandler implements CliCommandHandler {

    final CliOutputWriter writer;
    final Settings settings;

    @Override
    public void handle(CliCommandParameters parameters) {
        writer.println(parameters.toString());
        writer.println(settings.toString());
    }

    @Override
    public CliCommand command() {
        return CliCommand.SHOW_SETTINGS;
    }
}
