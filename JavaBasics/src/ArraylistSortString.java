import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSortString {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList();
        a.add("Dog");
        a.add("June");
        a.add("Tray");
        a.add("Food");
        a.add("12345");
        a.add("qwert");
        Collections.sort(a);
        System.out.println(a);
    }
}
