import java.util.ArrayList;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // ArrayList<String> list = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        // System.out.println(arr);
    
        arr.set(4,6);
        // System.out.println(arr);

       int elem =  arr.get(0);
        // System.out.println(elem);

        arr.remove(1);
        // System.out.println(arr);

        // System.out.println(arr.indexOf(3));
        //toArray()||
        // arr.isEmpty();
        // arr.isEmpty();arr.contains(arr);
    }
}
