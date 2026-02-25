package reflection.advanced;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    void execute() { System.out.println("Service Executed"); }
}

class Client {
    @Inject
    Service service;
}

public class SimpleDIContainer {
    public static void main(String[] args) throws Exception {

        Client client = new Client();

        for (Field field : Client.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(client, field.getType()
                        .getDeclaredConstructor()
                        .newInstance());
            }
        }

        client.service.execute();
    }
}