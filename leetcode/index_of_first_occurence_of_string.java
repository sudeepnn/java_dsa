public class index_of_first_occurence_of_string {
    public static int strStr(String haystack, String needle) {
    
        
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
              
                if((haystack.substring(i, needle.length()+i).equals(needle) )){
                    
                    return i;
                }
                
            }
                
            }
        return -1;
        }
         

        
    
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
    
}
