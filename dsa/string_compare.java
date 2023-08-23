public class string_compare {
    public static void main(String[] args) {
        String name="sudeep";
        String name1="sasdudeep";
        boolean flag=false;

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=name1.charAt(i)){
            flag=true;
            break;
            }
        }
        if(flag)
        System.out.println("String is diffrent");
        else
        System.out.println("String is same");
    }
    
}
