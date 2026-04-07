public class occurence_of_element {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,99};
        int f=arr[0];
        for(int i=1;i<arr.length;i++){
            f=f^arr[i];
        }
        System.out.println(f);
    }
}
