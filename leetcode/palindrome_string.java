class palindrome_string{
//this i have created string as a reverse it is immutable but works each timr new string is created so i should use string buffer
    //  public static boolean isPalindrome(String s) {
    //     String onlychar="";
    //     String reverse="";
    //     System.out.println(s);
    //     s=s.toLowerCase();
    //     for(int i=0;i<s.length();i++){
    //         if( s.charAt(i)>=97 && s.charAt(i)<=122 ||s.charAt(i)>=48 &&s.charAt(i)<=57){
    //             onlychar+=s.charAt(i);
    //         }

    //     }
    //     for(int j=onlychar.length()-1;j>=0;j--){
    //         reverse+=onlychar.charAt(j);
    //     }
    //     System.out.println(onlychar);
    //     System.out.println(reverse);
       
    //     if(s.length()>1)
    //     return onlychar.equals(reverse);
    //     else
    //     return false;
        
    // }
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
        
    }

    private static  boolean  isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuffer onlyalphanum=new StringBuffer();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122 ||s.charAt(i)>=48 &&s.charAt(i)<=57){
                onlyalphanum.append(s.charAt(i));
            }
        }
   
        //we need to convert to string and compare becase stringbuilder both the == and .equals are reference comparetion
        return onlyalphanum.toString().equals(onlyalphanum.reverse().toString());

       
    }
}