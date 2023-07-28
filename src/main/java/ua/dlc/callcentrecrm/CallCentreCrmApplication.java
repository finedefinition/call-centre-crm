package ua.dlc.callcentrecrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CallCentreCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(CallCentreCrmApplication.class, args);
    }
}
