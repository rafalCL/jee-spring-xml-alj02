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
        System.out.println(helloBean.toString());

        Hello helloBean2 = ac.getBean("hello2", Hello.class);
        helloBean.sayHello("Dave");
        System.out.println(helloBean2.toString());

        Hello helloBean2prim = ac.getBean("hello2", Hello.class);
        System.out.println(helloBean2prim.toString());

        Hello hello4 = ac.getBean("hello4", Hello.class);
        hello4.sayHello("Arthur");
    }
}
