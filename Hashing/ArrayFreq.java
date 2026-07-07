import java.util.HashMap;
import java.util.Map;

public class ArrayFreq {
    public static void main(String [] args)
    { 
    int [] arr={4,6,3,3,4,1,4,8,9};
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num : arr)
    {
        map.put(num,map.getOrDefault(num,0)+1);
    }
    for(Map.Entry<Integer,Integer> entry : map.entrySet())
    {
        System.out.println(entry.getKey()+"--->"+entry.getValue());
    }
}

}
