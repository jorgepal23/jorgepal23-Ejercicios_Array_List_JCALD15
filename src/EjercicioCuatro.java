import java.util.ArrayList;
import java.util.List;

public class EjercicioCuatro {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        List<String> commonElements = new ArrayList<>();
        for (String element : list1) {
            if (list2.contains(element)) {
                commonElements.add(element);
            }
        }
        System.out.println("Los elementos comunes son: " + commonElements);
    }
}