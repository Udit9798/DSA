import java.util.*;
public class frequency_characters { 
    public static HashMap<Character,Integer>frequency(String str){
        
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            // char[] ch=str.toCharArray();
           if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);

           }
           else{
            map.put(ch,1);
           }
        }
        return map;
    }
    public static void main(String[] args) {
        String str="hello";
        frequency_characters obj=new frequency_characters();
        System.out.println(obj.frequency(str));
    }
}
