public class caps_to_lowercase {
    public static void main(String[] args) {
        String name="SUD#EEP";
        String res="";
        int ascii;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)>='A'&&name.length()<='Z'){
                ascii=name.charAt(i)+32;
                res+=(char)ascii;
               
            }
            else{
                res+=name.charAt(i);
            }
        }
        System.out.println(res);

    }
}
