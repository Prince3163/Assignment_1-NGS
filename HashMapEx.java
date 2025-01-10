import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Double> hm = new HashMap<>();
        hm.put("Mahavir", 56000.00);
        hm.put("Dhruv", 78000.00);
        hm.put("Prem", 85000.00);
        hm.put("Keyur", 156000.00);
        hm.put("Jash", 99900.00);

        int count=0;
        for(Map.Entry<String,Double> entry : hm.entrySet()){
            System.out.println("Employee "+ ++count +" = "+entry.getKey() + " " + entry.getValue());
        }
    }
}
