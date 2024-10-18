import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits.size());
        System.out.println(fruits);
        fruits.remove("Banana");
        System.out.println(fruits);
        fruits.set(1, "Orange");
        System.out.println(fruits);
    }
}
