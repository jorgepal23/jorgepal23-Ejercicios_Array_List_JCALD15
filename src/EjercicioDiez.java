import java.util.ArrayList;
import java.util.List;

public class EjercicioDiez {
    public static void main(String[] args) {

        List<String> animales = new ArrayList<>();
        animales.add("perro");
        animales.add("gato");
        animales.add("pajaro");
        animales.add("conejo");
        animales.add("pato");
        animales.add("loro");
        animales.add("tigre");
        animales.add("tiburón");
        animales.add("rana");
        animales.add("tortuga");
        System.out.println(animales.contains("perro"));
        System.out.println(animales.contains("tiburón"));
    }
}
