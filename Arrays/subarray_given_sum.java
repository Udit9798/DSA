public class subarray_given_sum {
    public static void main(String[] args) {
        int[] arr={1,-1,3,-4};
        int k=5;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(sum-arr[i]==k){

            }
        }
    }
}
