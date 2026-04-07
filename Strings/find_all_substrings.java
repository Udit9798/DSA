public class find_all_substrings {
    public void getsubstrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        String str="helloudit";
        // ArrayList<String>substring=new ArrayList<>();
        // for(int i=0;i<str.length();i++){
        //     for(int j=i+1;j<=str.length();j++){
        //         System.out.println(str.substring(i,j));
        //     }
        // }
        find_all_substrings obj=new find_all_substrings();
        obj.getsubstrings(str);
    }
}
