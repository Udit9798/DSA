import java.lang.*;
import java.util.*;

class count_distinct_elements
{
    //count distinct elements
    public static int countDistinct(int[] arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        return map.size();
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int[] arr={1,2,3,4};
        System.out.println(countDistinct(arr));
	}
}
