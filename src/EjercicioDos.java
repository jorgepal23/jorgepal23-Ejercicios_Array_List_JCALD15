import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}