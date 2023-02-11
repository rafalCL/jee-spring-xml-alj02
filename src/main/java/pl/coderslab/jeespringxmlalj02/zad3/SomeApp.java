package pl.coderslab.jeespringxmlalj02.zad3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class SomeApp {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        MessageSender ms1 = ac.getBean("emailMessageSender", MessageSender.class);
        ms1.sendMessage("ala ma kota");

        // todo implement with spring
//        MessageSender ms2 = new MessageSender(new SmsService());
//        ms2.sendMessage("ala ma kota");
    }
}
