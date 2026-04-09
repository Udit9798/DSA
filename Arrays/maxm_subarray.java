public class maxm_subarray {
    public static void main(String[] args) {
        int[] arr={1,-1,3,-4};
        int maxsum=0;
        int currsum=arr[0];
        for(int i=1;i<arr.length;i++){
            currsum=Math.max(currsum,currsum+arr[i]);
            maxsum=Math.max(maxsum,currsum);
        }
        System.out.println(maxsum);
        
    }
}