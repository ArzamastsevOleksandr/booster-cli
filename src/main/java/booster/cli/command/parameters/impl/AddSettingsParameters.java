package booster.cli.command.parameters.impl;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;

public record AddSettingsParameters(Integer listVocabularyEntriesPagination,
                                    Integer listNotesPagination,
                                    Integer vocabularyPracticeBatchSize) implements CliCommandParameters {
    @Override
    public CliCommand command() {
        return CliCommand.ADD_SETTINGS;
    }
}
