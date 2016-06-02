package br.com.lucasaugusto.any;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lucas.augusto on 6/1/16.
 */
@RestController
@SpringCloudApplication
public class AnyApplication {

    @RequestMapping("/api/public/test")
    public String testPublic() {
        return "I am a public application.";
    }

    @RequestMapping("/api/secure/test")
    public String testSecure() {
        return "I am a secure application.";
    }

    public static void main(String[] args) {
        SpringApplication.run(AnyApplication.class, args);
    }
}
