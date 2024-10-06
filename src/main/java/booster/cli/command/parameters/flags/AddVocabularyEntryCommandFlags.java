package booster.cli.command.parameters.flags;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Arrays;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor
public enum AddVocabularyEntryCommandFlags {

    WORD("w"),
    DESCRIPTION("d"),
    SYNONYMS("s"),
    CORRECT_ANSWERS_COUNT("cac"),
    UNRECOGNIZED("IRRELEVANT");

    private final String alias;

    public static AddVocabularyEntryCommandFlags from(String inputAlias) {
        return Arrays.stream(values())
                .filter(flag -> flag.alias().equals(inputAlias))
                .findFirst()
                .orElse(UNRECOGNIZED);
    }
}
