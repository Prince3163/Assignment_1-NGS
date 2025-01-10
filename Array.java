import java.util.ArrayList;
import java.util.Iterator;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Aman");
        arr.add("Namita");
        arr.add("Piyush");
        arr.add("Anupam");
        arr.add("Ashneer");

        Iterator<String> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}