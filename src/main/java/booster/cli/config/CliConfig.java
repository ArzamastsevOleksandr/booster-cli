package booster.cli.config;

import booster.cli.adapter.CliInputReader;
import booster.cli.adapter.CliOutputWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Configuration
class CliConfig {

    @Bean
    CliInputReader cliInputReader() {
        return new CliInputReader(new BufferedReader(new InputStreamReader(System.in)));
    }

    @Bean
    CliOutputWriter cliOutputWriter() {
        return new CliOutputWriter(System.out);
    }

}
