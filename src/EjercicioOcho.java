import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjercicioOcho {
    public static void main(String[] args) {

        List<String> semana = new ArrayList<>();
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miercoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sabado");
        semana.add("Domingo");

        System.out.println("Lista original: " + semana);
        Collections.reverse(semana);
        System.out.println("Lista invertida: " + semana);
    }
}