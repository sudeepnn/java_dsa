public class no_of_char_and_words_in_sentence {
    public static void main(String[] args) {
        int count=0;
        StringBuffer sb=new StringBuffer();
        String sen="HElllo world WElcome you ALL ";
        char chary[]=sen.toCharArray();
        for (char c : chary) {
           
            if(c!=' '){
                count+=1;
                sb.append(c);
            }
            else{
                System.out.println(sb.toString());
                sb.delete(0, sb.length());

            }
            
            
        }
        System.out.println(sb.toString());
    }
}
