package pl.coderslab.jeespringxmlalj02;

public class Hello {
    private String helloText;

    public Hello() {
        this.helloText = "Hi,";
    }

    public Hello(String helloText) {
        this.helloText = helloText;
    }

    public void setHelloText(String helloText) { // helloText // setHelloText getHelloText
        this.helloText = helloText;
    }

    public void sayHello(String name) {
        System.out.println(helloText + " " + name);
    }
}
