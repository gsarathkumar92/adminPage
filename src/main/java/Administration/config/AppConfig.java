package Administration.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({ "Administration.config","Administration.user" })
@Import({ MongoConfig.class })
public class AppConfig {

}