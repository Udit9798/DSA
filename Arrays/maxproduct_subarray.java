public class maxproduct_subarray {
    public static void main(String[] args) {
        int[] arr={-1,3,-5,2,6};
       int max=arr[0];
       int min=arr[0];
       int result=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=min;
                min=max;
                max=temp;

            }
            max=Math.max(arr[i],max*arr[i]);
            min=Math.min(arr[i],min*arr[i]);
            result=Math.max(result,max);
        }
        System.out.println("Maxm product subarray is "+result);
    }
}
