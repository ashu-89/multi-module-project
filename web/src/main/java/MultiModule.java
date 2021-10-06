import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ashu.*"})
@EntityScan(basePackages = {"com.ashu.*"})
@EnableJpaRepositories(basePackages = {"com.ashu.*"})
public class MultiModule {
    public static void main(String[] args) {
        SpringApplication.run(MultiModule.class);
    }
}
