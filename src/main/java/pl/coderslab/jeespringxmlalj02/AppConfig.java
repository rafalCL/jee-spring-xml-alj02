package pl.coderslab.jeespringxmlalj02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pl.coderslab.jeespringxmlalj02.zad3.MessageSender;
import pl.coderslab.jeespringxmlalj02.zad3.MessageService;
import pl.coderslab.jeespringxmlalj02.zad3.SmsService;

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

    @Bean
    public MessageSender senderBean() {
        return new MessageSender(smsServiceBean());
    }

    @Bean
    public MessageService smsServiceBean() {
        return new SmsService();
    }

    @Bean
    @Scope("prototype")
    public Hello helloWorldPrototype() {
        return new Hello();
    }
}
