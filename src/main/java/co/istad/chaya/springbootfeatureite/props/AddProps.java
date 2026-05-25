package co.istad.chaya.springbootfeatureite.props;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "myapp")
@Getter
@Setter
@NoArgsConstructor
public class AddProps {
    private String info;
    private Integer version;
    private Integer year;
    private Integer prot;
}
