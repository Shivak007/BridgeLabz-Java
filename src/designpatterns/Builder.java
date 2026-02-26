package designpatterns;
class Users {
    private String name;
    private int age;
    private Users(Builder b){ this.name=b.name; this.age=b.age; }

    static class Builder {
        private String name; private int age;
        Builder setName(String name){ this.name=name; return this; }
        Builder setAge(int age){ this.age=age; return this; }
        Users build(){ return new Users(this); }
    }
}
public class Builder {
    public static void main(String[] args){
        Users u = new Users.Builder().setName("Shiva").setAge(22).build();
    }
}