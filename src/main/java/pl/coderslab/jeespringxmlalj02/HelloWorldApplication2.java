package pl.coderslab.jeespringxmlalj02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldApplication2 {
    public static void main(String[] args) {
        ApplicationContext ac2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Hello bean1 = ac2.getBean("myHelloBeanAnnotationConfigured", Hello.class);
        bean1.sayHello("Charles");

        Hello ac3 = ac2.getBean("myHelloBean2", Hello.class);
        ac3.sayHello("Arthur");

        Hello h1 = ac2.getBean("helloWorldPrototype", Hello.class);
        System.out.println(h1.toString());
        Hello h2 = ac2.getBean("helloWorldPrototype", Hello.class);
        System.out.println(h2.toString());
    }
}
