package booster.cli;

import booster.cli.launch.CliLauncher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@ConfigurationPropertiesScan
@EnableConfigurationProperties
@SpringBootApplication
class CliApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CliApplication.class, args);

        context.getBean(CliLauncher.class).start();
    }

}

