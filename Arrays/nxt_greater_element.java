import java.util.*;
class nxt_greater_element{
    public static int nxtgrtr(int[] arr,int k){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k && i!=arr.length-1){
                return arr[i+1];
            }
            if(arr[i]>k){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={4,5,7,3};
        int k=5;
        System.out.println(nxtgrtr(arr,k));
    }
}