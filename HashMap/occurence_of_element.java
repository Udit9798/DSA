import java.util.*;
class occurence_of_element {
    public static int occurence(int[] arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr={2,2,3,3,99};
        System.out.println(occurence(arr));
        
    }
}