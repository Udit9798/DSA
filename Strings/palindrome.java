public class palindrome {
    public boolean ispalindrome(String str){
        String newstr="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            newstr+=ch;
        }
        return newstr.equals(str);

    }
    public static void main(String[] args) {
        String str="hello";
        palindrome obj=new palindrome();
        System.out.println(obj.ispalindrome(str));
    }
}
