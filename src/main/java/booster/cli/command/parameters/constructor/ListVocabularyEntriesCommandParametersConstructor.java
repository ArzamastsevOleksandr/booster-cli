package booster.cli.command.parameters.constructor;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.impl.ListVocabularyEntriesParameters;
import org.springframework.stereotype.Component;

// lve 5
@Component
class ListVocabularyEntriesCommandParametersConstructor implements CliCommandParametersConstructor {

    @Override
    public CliCommandParameters construct(String input) {
        return new ListVocabularyEntriesParameters(Integer.parseInt(input));
    }

    @Override
    public CliCommand command() {
        return CliCommand.LIST_VOCABULARY_ENTRIES;
    }
}
