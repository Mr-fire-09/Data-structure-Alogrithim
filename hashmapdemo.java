import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapdemo {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Neeraj ");
        map.put(2, "Rohit ");
        map.put(3, "Saurabh ");
        map.put(4, "Ankit ");


        System.out.println("HashMap: " + map);

        String student = map.get(1);
        System.out.println("Student with key 1: " + student);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Rohit "));

        for(int  i : map.keySet() ){
            System.out.println(map.get(i));


        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries) {
           
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(map);



           

    }
    }
}