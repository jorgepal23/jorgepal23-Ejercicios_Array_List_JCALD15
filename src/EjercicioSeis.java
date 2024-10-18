import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class EjercicioSeis {
    public static void main(String[] args) {

        List<String> ciudades = new ArrayList<>();
        ciudades.add("Bogota");
        ciudades.add("Antioquia");
        ciudades.add("Cartagena");
        ciudades.add("Santamarta");
        ciudades.add("Tunja");

        Collections.shuffle(ciudades);

        System.out.println("Ciudades antes de revolver: " + ciudades);

        Collections.shuffle(ciudades);

        System.out.println("Ciudades después de revolver: " + ciudades);
    }
}
