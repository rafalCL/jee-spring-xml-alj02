package pl.coderslab.jeespringxmlalj02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.jeespringxmlalj02.beans.RandomJoke;

public class HelloWorldApplication3 {
    public static void main(String[] args) {
        ApplicationContext ac2 = new AnnotationConfigApplicationContext(AppConfig2.class);
        RandomJoke bean1 = ac2.getBean("randomJoke", RandomJoke.class);
        String randomJoke = bean1.getRandomJoke();
        System.out.println(randomJoke);
    }
}
