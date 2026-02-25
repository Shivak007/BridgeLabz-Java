package reflection.advanced;
import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class LoggingProxy {
    public static void main(String[] args) {

        Greeting target = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                (proxyObj, method, methodArgs) -> {
                    System.out.println("Method called: " + method.getName());
                    return method.invoke(target, methodArgs);
                });

        proxy.sayHello();
    }
}