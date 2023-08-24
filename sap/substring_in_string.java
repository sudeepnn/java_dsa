public class substring_in_string {
    public static boolean substring(String str,String substr){
        int j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==substr.charAt(j)){
                j++;
            }
            else{
                j=0;
            }
            if(j==substr.length()){
                System.out.println(i-j+1);
                return true;
            }
        }
        
        
        return false;
    }
    public static void main(String[] args) {
        System.out.println(substring("hello world how", "how"));
        
    }
}
