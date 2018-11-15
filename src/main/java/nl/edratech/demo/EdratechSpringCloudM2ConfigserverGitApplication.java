package nl.edratech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EdratechSpringCloudM2ConfigserverGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdratechSpringCloudM2ConfigserverGitApplication.class, args);
    }
}
