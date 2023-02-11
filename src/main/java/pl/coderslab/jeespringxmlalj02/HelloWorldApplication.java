package pl.coderslab.jeespringxmlalj02;

public class HelloWorldApplication {
    public static void main(String[] args) {
        Hello hw = new Hello("Hello");
//        Hello hw = MyFramework.gveMeHello(); // inversion of control
//        - framework is responsible for object's lifecycle
        hw.sayHello("Dave");
    }
}
