package hello;

import hello.boot.MySpringApplication;
import hello.boot.MySpringBootApplication;

/**
 * 해당 경로의 하위 패키지는 CompontScan 대상이 된다. (@MySpringBootApplication)
 */
@MySpringBootApplication
public class MySpringBootMain {

    public static void main(String[] args) {
        System.out.println("MySpringBootMain.main");
        MySpringApplication.run(MySpringBootMain.class, args);
    }
}
