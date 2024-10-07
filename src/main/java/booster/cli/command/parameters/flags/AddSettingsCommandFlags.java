package booster.cli.command.parameters.flags;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Arrays;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor
public enum AddSettingsCommandFlags {

    LIST_VOCABULARY_ENTRIES_PAGINATION("lvep"),
    LIST_NOTES_PAGINATION("lnp"),
    VOCABULARY_PRACTICE_BATCH_SIZE("vpbs"),
    UNRECOGNIZED("IRRELEVANT");

    private final String alias;

    public static AddSettingsCommandFlags from(String inputAlias) {
        return Arrays.stream(values())
                .filter(flag -> flag.alias().equals(inputAlias))
                .findFirst()
                .orElse(UNRECOGNIZED);
    }
}
