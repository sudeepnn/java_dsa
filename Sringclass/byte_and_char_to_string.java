import javax.print.DocFlavor.STRING;

public class byte_and_char_to_string {
    public static void main(String[] args) {
        byte b[]={97,98,99,100};
        String s=new String(b);
        System.out.println(s);
        
        char c[]={'A','B','C','D'};
        String s1=new String(c);
        System.out.println(s1);
    }
    
}
