package annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}

class Calculator {

    @CacheResult
    int square(int n) {
        System.out.println("Computing...");
        return n * n;
    }
}

public class CacheExample {
    static Map<String, Object> cache = new HashMap<>();

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();
        Method method = Calculator.class.getDeclaredMethod("square", int.class);

        int input = 5;
        String key = method.getName() + input;

        if (method.isAnnotationPresent(CacheResult.class)) {

            if (cache.containsKey(key)) {
                System.out.println("From Cache: " + cache.get(key));
            } else {
                Object result = method.invoke(calc, input);
                cache.put(key, result);
                System.out.println("Computed: " + result);
            }
        }
    }
}
