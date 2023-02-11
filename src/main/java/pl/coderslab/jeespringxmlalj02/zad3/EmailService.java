package pl.coderslab.jeespringxmlalj02.zad3;

public class EmailService implements MessageService {
    @Override
    public void send(String msg) {
        System.out.println("sending email with body: " + msg);
    }
}
