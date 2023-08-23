public class string_scp_heap {
    public static void main(String[] args) {
        String s1=new String("sudeep");
        String s2=s1.toLowerCase();
        String s3=s1.toUpperCase();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
    
}
