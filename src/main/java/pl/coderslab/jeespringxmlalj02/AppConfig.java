package pl.coderslab.jeespringxmlalj02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Hello myHelloBeanAnnotationConfigured() {
        return new Hello();
    }

    @Bean
    public Hello myHelloBean2() {
        return new Hello("Hello from annotation configured bean");
    }

    @Bean
    public Hello myHelloBean3() {
        Hello result = new Hello();
        result.setHelloText("Hola Amigo,");
        return result;
    }
}
