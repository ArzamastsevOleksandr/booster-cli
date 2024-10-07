package booster.cli.command.parameters.impl;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Map;
import java.util.Set;

@Getter
@Accessors(fluent = true)
@Builder
@ToString
public class AddVocabularyEntryParameters implements CliCommandParameters {

    private String word;
    private String description;
    private Integer correctAnswersCount;
    private Set<String> synonyms;
    private Map<String, String> unrecognized;

    @Override
    public CliCommand command() {
        return CliCommand.ADD_VOCABULARY_ENTRY;
    }
}
