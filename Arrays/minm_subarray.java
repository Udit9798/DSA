public class minm_subarray {
    public static void main(String[] args) {
        int[] arr={1,-1,3,-4};
        int minsum=arr[0];
        int currsum=arr[0];
        for(int i=1;i<arr.length;i++){
            currsum=Math.min(currsum,currsum-arr[i]);
            minsum=Math.min(minsum,currsum);
        }
        System.out.println(minsum);
    }
}
