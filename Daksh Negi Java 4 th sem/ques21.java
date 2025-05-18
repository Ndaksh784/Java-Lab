import java.util.ArrayList;
import java.util.Iterator;

public class ques21{
    public static void removeEvenLength(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        strings.add("coding");
        strings.add("example");
        strings.add("code");

        System.out.println("Before removing even length strings: " + strings);
        removeEvenLength(strings);
        System.out.println("After removing even length strings: " + strings);
    }
}
