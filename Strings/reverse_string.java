public class reverse_string {
    public static void main(String[] args) {
        String str="Hello";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            System.out.print(ch);
        }
        // StringBuilder sb=new StringBuilder(str);
        // System.out.println(sb.reverse());
        
    }
}
