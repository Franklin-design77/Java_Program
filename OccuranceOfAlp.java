import java.util.HashMap;
public class OccuranceOfAlp{
    public static void main(String[]args){
        String str="Apple";
        
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(char key:map.keySet()){
            System.out.println(key+" --->"+map.get(key));
        }
    }
}
/*
import java.util.HashMap;
class Main{
    public static void main(String[]args){
        int arr[]={1,2,3,4,3,5,6,7,1,2,4,8,9,10,11};
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(HashMap.Entry<Integer,Integer>pr,map.entry.set())
    }
    
} */