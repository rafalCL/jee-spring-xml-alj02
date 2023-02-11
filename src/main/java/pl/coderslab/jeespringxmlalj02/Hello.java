package pl.coderslab.jeespringxmlalj02;

public class Hello {
    private final String helloText;

    public Hello(String helloText) {
        this.helloText = helloText;
    }

    public void sayHello(String name) {
        System.out.println(helloText + " " + name);
    }
}
