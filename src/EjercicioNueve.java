import java.util.ArrayList;
import java.util.List;
public class EjercicioNueve {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("casa");
        palabras.add("casa");
        palabras.add("gato");
        palabras.add("perro");
        palabras.add("perro");
        palabras.add("perro");
        palabras.add("perro");
        palabras.add("perro");

        System.out.println("perro esta : "+palabras.lastIndexOf("perro") + " Veces");
    }
}