package mk.ukim.finki.emtlab203012;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ServletComponentScan
@EnableScheduling

public class EmtLab203012Application {

    public static void main(String[] args) {
        SpringApplication.run(EmtLab203012Application.class, args);
    }

}
