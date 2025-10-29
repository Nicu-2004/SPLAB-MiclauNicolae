package splab.bookweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "splab")
public class BookwebApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookwebApplication.class, args);
    }
}
