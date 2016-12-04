package routes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        if (args.length > 0) {
            String fileName =  args[0];
            Routes.getInstance(fileName);
        } else {
            Routes.getInstance();
        }
        SpringApplication.run(Application.class, args);
    }
}
