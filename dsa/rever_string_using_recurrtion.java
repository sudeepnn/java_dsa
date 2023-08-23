public class rever_string_using_recurrtion {
   public static void main(String[] args) {
     String name="sudeep";
    String res=reverser(name);
    System.out.println(res);
   }
 
   public static String reverser(String s){
    if(s==null || s.length()<=1){
        return s;
    }
    return reverser(s.substring(1))+s.charAt(0);
} 
}


