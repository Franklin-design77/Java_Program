import java.util.*;
import java.lang.Math;
public class SqureOfNum{
    public static void main(String[]args){
        int []arr={2,3,4,5,6};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            int result=(int)Math.pow(num,2);
            map.put(num,result);
        }
        for(int key:map.keySet()){
            System.out.println(key+"--->"+map.get(key));
        }
    }
}