

public class string_stringbuffer_01 {
    public static void main(String[] args) {
        String s1=new String("Sudeep");
        String s2=new String("Sudeep");

        System.out.println("String class: ");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        StringBuffer sb1=new StringBuffer("Sudeep");
        StringBuffer sb2=new StringBuffer("Sudeep");

        System.out.println("string buffer class");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }
    
}
