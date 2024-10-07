package booster.cli.command.parameters.impl;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;

public record ListVocabularyEntriesParameters(Integer pagination) implements CliCommandParameters {
    @Override
    public CliCommand command() {
        return CliCommand.LIST_VOCABULARY_ENTRIES;
    }
}
