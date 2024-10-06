package booster.cli.adapter;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.BufferedReader;

@RequiredArgsConstructor
public class CliInputReader {

    private final BufferedReader bufferedReader;

    @SneakyThrows
    public String readLine() {
        return bufferedReader.readLine().strip();
    }

}
