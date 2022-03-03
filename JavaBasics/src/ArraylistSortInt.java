import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSortInt {
    public static ArrayList<Integer> forwardsort(ArrayList<Integer> a){
        Collections.sort(a);
        return a;
    }
    public static ArrayList<Integer> reversesort(ArrayList<Integer> a){
        Collections.sort(a, Collections.reverseOrder());
        return a;
    }
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(11);
        a.add(78);
        a.add(12);
        a.add(44);
        a.add(14);
        a.add(34);
        //Before sorting
        for(int x:a){
            System.out.println("Before sorting: "+x);
        }
        //After reverse sorting
        reversesort(a);
        System.out.println("After reverse sorting: "+a);

        //After forward sorting
        forwardsort(a);
        System.out.println("After forward sorting: "+a);
    }
}
