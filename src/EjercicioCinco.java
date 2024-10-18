import java.util.ArrayList;
import java.util.List;

public class EjercicioCinco {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }
        Integer[] array = numeros.toArray(new Integer[0]);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}