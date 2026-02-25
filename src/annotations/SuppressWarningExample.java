package annotations;
import java.util.*;

public class SuppressWarningExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList();   // raw type
        list.add("Java");
        list.add("Reflection");

        for (Object obj : list)
            System.out.println(obj);
    }
}
