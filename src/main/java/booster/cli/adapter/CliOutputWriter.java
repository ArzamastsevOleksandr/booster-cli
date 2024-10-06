package booster.cli.adapter;

import lombok.RequiredArgsConstructor;

import java.io.PrintStream;

@RequiredArgsConstructor
public class CliOutputWriter {

    private final PrintStream out;

    public void println(String message) {
        out.println(">> " +message);
    }

    public void println() {
        out.println(">>");
    }

    public void prompt() {
        out.print(">> ");
    }
}
