package booster.cli.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "settings", ignoreInvalidFields = true)
@ToString
public class Settings {

    private Vocabulary vocabulary = new Vocabulary();
    private Notes notes = new Notes();

    @ToString
    @Setter
    @Getter
    public static class Vocabulary {
        private Integer pagination;
        private Integer practiceBatchSize;
    }

    @ToString
    @Setter
    public static class Notes {
        private Integer pagination;
    }
}
