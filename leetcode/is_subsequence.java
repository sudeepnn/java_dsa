public class is_subsequence {
    public static boolean isSubsequence(String s, String t) {
        StringBuffer b=new StringBuffer();
        if(s.length()==0)return true;
        int i=0;
          for(int j=0;j<t.length();j++){
            if(i<s.length()){
                if(s.charAt(i)==t.charAt(j)){
                b.append(t.charAt(j));
                i++;
            }  
            }
            else
            return true;
        }  
        return b.toString().equals(s);
    }
    public static void main(String[] args) {
        System.out.println(isSubsequence("", "abc"));
    }
}
