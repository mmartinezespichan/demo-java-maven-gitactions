package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "<html><boby>"
        		+ "<h2>Hello, World!</h2><br /><br /><br />"      
        		+ "<img src=\"/image.jpg\">"  		
        		+ "</boby></html>";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}