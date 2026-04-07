import java.util.*;
public class check_anagram {
    public boolean checkAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        String str1="listen";
        String str2="hello";
        check_anagram obj=new check_anagram();
        System.out.println(obj.checkAnagram(str1, str2));
    }
}
