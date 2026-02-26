package designpatterns;
class Employee implements Cloneable {
    String name;
    Employee(String name){ this.name=name; }
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
public class Prototype {
    public static void main(String[] args) throws Exception{
        Employee e1 = new Employee("Aarav");
        Employee e2 = e1.clone();
        System.out.println(e2.name);
    }
}
