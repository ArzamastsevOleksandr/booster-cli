package booster.cli.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Arrays;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor
public enum CliCommand {

    HELP("h"),
    ADD_VOCABULARY_ENTRY("ave"),
    EXIT("e"),
    EMPTY(""),
    UNRECOGNIZED("IRRELEVANT");

    private final String alias;

    public static CliCommand from(String input) {
        return Arrays.stream(CliCommand.values())
                .filter(command -> command.alias().equals(input))
                .findFirst()
                .orElse(UNRECOGNIZED);
    }
}
