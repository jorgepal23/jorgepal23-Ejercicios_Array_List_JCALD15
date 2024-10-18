import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Integer edad=39;
        String nombre="Jorge";
        String nombre1="Enrique";
        String nombre2="Hector";
        List<Object> listAlumnos = new ArrayList<>();
        listAlumnos.add(nombre);
        listAlumnos.add(nombre1);
        listAlumnos.add(nombre2);
        listAlumnos.add(edad);

        System.out.println(listAlumnos);
        System.out.println(listAlumnos.size());
        System.out.println(listAlumnos.get(0));
        System.out.println(listAlumnos.getFirst());
        System.out.println(listAlumnos.getLast());
        listAlumnos.remove(2);
        System.out.println(listAlumnos);
        listAlumnos.removeFirst();
        listAlumnos.removeLast();
        System.out.println(listAlumnos);

        System.out.println(listAlumnos.isEmpty());
        listAlumnos.clear();

        System.out.println(listAlumnos.isEmpty());
        listAlumnos.add(nombre);
        listAlumnos.add(nombre1);
        listAlumnos.add(nombre2);
        listAlumnos.add(nombre1);
        listAlumnos.add(1,"Juan");

        System.out.println(listAlumnos);
        listAlumnos.addFirst("Dario");
        listAlumnos.addLast("Mongo");

        System.out.println(listAlumnos);
        listAlumnos.set(3,"Petunia");

        System.out.println(listAlumnos);
        System.out.println(listAlumnos.subList(2,4));
    }
}
