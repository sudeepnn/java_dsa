public class string_capacity {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("abcdefgaaaaaaaaaaaaaaaaaaaa");
        System.out.println(sb.capacity());


        StringBuffer sb2=new StringBuffer("sudeep");
        System.out.println(sb2.capacity());
    }
}
