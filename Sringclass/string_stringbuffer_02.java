public class string_stringbuffer_02 {
    public static void main(String[] args) {
        System.out.println("Strings immutable: ");
        String s1=new String("sudeep");
        s1.concat("naik");
        System.out.println(s1);
        // String s2=s1.concat("naik"); //diffrent object is created 
        // System.out.println(s2); 
        // System.out.println(s1==s2); //false

        System.out.println("Sting buffer mutable: ");
        StringBuffer sb1=new StringBuffer("Sudeep");
        sb1.append("Naik");
        // StringBuffer sb2= sb1.append("Naik"); //same object is being refrenced because it is mutable 
        // System.out.println(sb2==sb1); // true
        System.out.println(sb1);
    }
}
