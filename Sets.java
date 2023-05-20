import java.util.HashSet;
import java.util.Iterator;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(2);
        num.add(1);
        System.out.println(num);

       int size = num.size();
       System.out.println(size);

    //    Iterator it = num.iterator();
    //    while(it.hasNext()){
    //     System.out.println(it.next());
    //    }
    // num.contains(num)
    // num.toArray()
    // num.remove(num)
    // num.clear();
    }
}
