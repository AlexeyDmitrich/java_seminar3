import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Task2 {
    // Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
    // Вывести название каждой планеты и количество его повторений в списке.
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("Venera", "Saturn", "Venera", "Mars", "Jupiter", "Earth", "Earth"));
        arrayList.sort(Comparator.naturalOrder());
        int count = 1;

        for (int i = arrayList.size() - 1; i > 0; i--) {
            if (arrayList.get(i).equals(arrayList.get(i - 1))) {
                count++;

            } else {
                System.out.println(arrayList.get(i) + " повторяется " + count + " раз.");
                count = 1;
            }

        }

        System.out.println(arrayList.get(0) + " повторяется " + count + " раз.");
    }
}