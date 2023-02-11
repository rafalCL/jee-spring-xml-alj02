package pl.coderslab.jeespringxmlalj02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApplication {
    public static void main(String[] args) {
//        Hello hw = new Hello("Hello");
//        Hello hw = MyFramework.gveMeHello(); // inversion of control
//        - framework is responsible for object's lifecycle
//        hw.sayHello("Dave");

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Hello helloBean = ac.getBean("hello", Hello.class);
        helloBean.sayHello("HAL");
    }
}
