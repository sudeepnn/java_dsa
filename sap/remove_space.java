public class remove_space {
    public static void main(String[] args) {
        String S="geeks for geeks";
        StringBuffer b=new StringBuffer();
        for(int i=0;i<S.length();i++){
           if(S.charAt(i)!=' ')
            b.append(S.charAt(i));
        }
        System.out.println(b.toString());
    }
    
    
}
