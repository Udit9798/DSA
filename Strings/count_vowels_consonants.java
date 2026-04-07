public class count_vowels_consonants {
    public int countVowels(String str){
        str=str.toLowerCase();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if("aeiouAEIOU".contains(String.valueOf(ch))){
                count++;
            }
        }
        return count;
    }
    public int countConsonants(String str){
        int count=0;
        str=str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(!"aeiouAEIOU".contains(String.valueOf(ch))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="kumar";
        count_vowels_consonants obj=new count_vowels_consonants();
        System.out.println("vowels: "+obj.countVowels(str)+" consonants: "+obj.countConsonants(str));
    }
}
