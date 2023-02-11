package pl.coderslab.jeespringxmlalj02.zad3;

public class SmsService implements MessageService {
    @Override
    public void send(String msg) {
        System.out.println("sending SMS with body: " + msg);
    }
}
