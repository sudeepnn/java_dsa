import java.util.Arrays;

public class logest_prefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start=strs[0];
        int j=0;
       for (j=0;j<start.length();j++){
         for(int i=1;i<strs.length;i++){
            if(start.charAt(j)==strs[i].charAt(j)){
                continue;
                
            }
            else
            if(j==0)
            return "";
            return start.substring(0, j);
        }
       }

        return start;
        
    }
    public static void main(String[] args) {
        String sr[]={"reflower","flow","flight"};
        System.out.println(longestCommonPrefix(sr));
        
    }
    
}
