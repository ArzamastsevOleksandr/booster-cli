package booster.cli.command.parameters.constructor;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.impl.PracticeVocabularyParameters;
import org.springframework.stereotype.Component;

// pv
@Component
class PracticeVocabularyCommandParametersConstructor implements CliCommandParametersConstructor {

    @Override
    public CliCommandParameters construct(String input) {
        return new PracticeVocabularyParameters();
    }

    @Override
    public CliCommand command() {
        return CliCommand.PRACTICE_VOCABULARY;
    }
}
