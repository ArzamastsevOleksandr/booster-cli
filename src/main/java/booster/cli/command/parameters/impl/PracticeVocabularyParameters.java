package booster.cli.command.parameters.impl;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;

public record PracticeVocabularyParameters() implements CliCommandParameters {
    @Override
    public CliCommand command() {
        return CliCommand.PRACTICE_VOCABULARY;
    }
}
