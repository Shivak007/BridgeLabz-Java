package designpatterns;

interface ChatMediator {
    void send(String msg, User user);
}

class ChatRoom implements ChatMediator {
    public void send(String msg, User user) {
        System.out.println(user.name + ": " + msg);
    }
}

class User {
    String name;
    ChatMediator mediator;

    User(String n, ChatMediator m) {
        name = n;
        mediator = m;
    }

    void send(String msg) {
        mediator.send(msg, this);
    }
}

public class Mediator {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();
        new User("Shiva", chat).send("Hello");
    }
}