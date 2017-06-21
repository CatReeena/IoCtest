package theymademe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Shera on 18.05.2017.
 */

@Configuration
public class AppConfig {


    @Bean
    public Animal chooseCat()
    {
        return new Cat();
    }

    @Bean
    public TestSpring testSpring() {return new TestSpring();}
}
