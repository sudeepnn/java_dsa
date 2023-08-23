public class words_vovwel_freqency {

    public static void main(String[] args) {
        String name="sudeep N Naik";
        String arry[]=name.split(" ");
        System.out.println("Total no of worlds: "+arry.length);
        for (String string : arry) {
            System.out.println(string+" ");
        }

        char charry[]=name.toLowerCase().toCharArray();
        for(char c:charry){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            
        }
    }
}
