import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSort {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList();
        a.add("Dog");
        a.add("June");
        a.add("Tray");
        a.add("Food");
        a.add("12345");
        Collections.sort(a);
        System.out.println(a);
    }
}
