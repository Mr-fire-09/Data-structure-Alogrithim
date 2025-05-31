
import java.util.*;

public class hashmapdemo2 {

    public static void main(String[] args) {
        HashMap< String, Integer> map = new HashMap<>();
        map.put("Apple ", 10);
        map.put("Banana ", 20);
        map.put("Cherry ", 30);
        map.put("Date ", 40);
        map.put("Elderberry ", 50);


        for(String  i : map.keySet() ){
            System.out.println(map.get(i));


        }

    
        
        
    }
}