package designpatterns;
import java.util.*;
class Font { String type; Font(String t){ type=t; } }
class FontFactory {
    private static Map<String, Font> cache = new HashMap<>();
    static Font getFont(String type){
        return cache.computeIfAbsent(type, Font::new);
    }
}
public class Flyweight{
    public static void main(String[] args){
        Font f1 = FontFactory.getFont("Arial");
        Font f2 = FontFactory.getFont("Arial");
        System.out.println(f1 == f2);
    }
}