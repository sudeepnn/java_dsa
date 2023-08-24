import java.util.Stack;

public class reverse_string {
    
    public static String reverseWords(String S)
    {
        String temp="",res="";
        Stack<String> stk=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='.')
            temp+=S.charAt(i);
            if(S.charAt(i)=='.')
            {
                stk.push(temp);
                temp="";
            }
            
        }
        stk.push(temp);
       
        while(!stk.empty()){
            String val=stk.pop();
            res+=val+".";
        }
       
res=res.substring(0, res.length()-1);

        return res;
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
        
    }
    
}
