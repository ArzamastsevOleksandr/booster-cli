package booster.cli.command.parameters.constructor;

import booster.cli.command.CliCommand;
import booster.cli.command.parameters.CliCommandParameters;
import booster.cli.command.parameters.flags.AddVocabularyEntryCommandFlags;
import booster.cli.command.parameters.impl.AddVocabularyEntryParameters;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

// ave    w  =    destiny    d =   wird bid ful s    =fate, kaka       c=       100
// command = alias [param=value]*
@Component
class AddVocabularyEntryCommandParametersConstructor implements CliCommandParametersConstructor {

    @Override
    public CliCommandParameters construct(String input) {
        String inputRemainder = input;

        int indexOfLastFlagSeparator = inputRemainder.lastIndexOf('=');
        int indexOfLastFlagValuePair = inputRemainder.substring(0, indexOfLastFlagSeparator).trim().lastIndexOf(' ');

        Map<String, String> unrecognized = new HashMap<>();
        var builder = AddVocabularyEntryParameters.builder();

        String lastFlagValue = inputRemainder.substring(indexOfLastFlagSeparator + 1).trim();

        String lastFlagAlias = indexOfLastFlagValuePair == -1
                ? inputRemainder.substring(0, indexOfLastFlagSeparator).trim()
                : inputRemainder.substring(indexOfLastFlagValuePair, indexOfLastFlagSeparator).trim();

        AddVocabularyEntryCommandFlags flags = AddVocabularyEntryCommandFlags.from(lastFlagAlias);

        switch (flags) {
            case DESCRIPTION -> builder.description(lastFlagValue);
            case WORD -> builder.word(lastFlagValue);
            case SYNONYMS -> builder.synonyms(synonyms(lastFlagValue));
            case CORRECT_ANSWERS_COUNT -> builder.correctAnswersCount(Integer.parseInt(lastFlagValue));
            case UNRECOGNIZED -> unrecognized.put(lastFlagAlias, lastFlagValue);
        }

        inputRemainder = indexOfLastFlagValuePair == -1
                ? ""
                : inputRemainder.substring(0, indexOfLastFlagValuePair).trim();

        while (!inputRemainder.isBlank()) {
            indexOfLastFlagSeparator = inputRemainder.lastIndexOf('=');
            indexOfLastFlagValuePair = inputRemainder.substring(0, indexOfLastFlagSeparator).trim().lastIndexOf(' ');

            lastFlagValue = inputRemainder.substring(indexOfLastFlagSeparator + 1).trim();

            lastFlagAlias = indexOfLastFlagValuePair == -1
                    ? inputRemainder.substring(0, indexOfLastFlagSeparator).trim()
                    : inputRemainder.substring(indexOfLastFlagValuePair, indexOfLastFlagSeparator).trim();

            flags = AddVocabularyEntryCommandFlags.from(lastFlagAlias);

            switch (flags) {
                case DESCRIPTION -> builder.description(lastFlagValue);
                case WORD -> builder.word(lastFlagValue);
                case SYNONYMS -> builder.synonyms(synonyms(lastFlagValue));
                case CORRECT_ANSWERS_COUNT -> builder.correctAnswersCount(Integer.parseInt(lastFlagValue));
                case UNRECOGNIZED -> unrecognized.put(lastFlagAlias, lastFlagValue);
            }

            inputRemainder = indexOfLastFlagValuePair == -1
                    ? ""
                    : inputRemainder.substring(0, indexOfLastFlagValuePair).trim();
        }
        return builder.unrecognized(unrecognized).build();
    }

    private Set<String> synonyms(String lastFlagValue) {
        return Arrays.stream(lastFlagValue.split(";"))
                .map(String::trim)
                .filter(s -> !s.isBlank())
                .collect(toSet());
    }

    @Override
    public CliCommand command() {
        return CliCommand.ADD_VOCABULARY_ENTRY;
    }
}
