import java.util.Arrays;

public class remove_duplicate_from_string {
    // public static void main(String[] args) {
    //     String name="ssudeep";
    //     String newstr="";
    //     System.out.println(name);
    //     for(int i=0;i<name.length();i++){
    //         char comp=name.charAt(i);
    //         for(int j=i+1;j<name.length();j++){
    //             if(comp==name.charAt(j)){
    //                 System.out.println(comp);
    //                 newstr=name.substring(0, j-1)+name.substring(j);
    //             }
    //         }
    //     }
    //     System.out.println(newstr);
    // }
    // public static void main(String[] args) {
    //     String name="ssudeepe";

    //     char arr[]=name.toCharArray();
    //     for(int i=0;i<arr.length;i++){
    //         char comp=arr[i];
    //         for(int j=i+1;j<arr.length;j++){
    //             if(comp==arr[j] && comp!=' '){
    //                 arr[j]=' ';
    //             }
    //         }
            

    //     }
    //     char res[]=remove(arr,' ');
    //     System.out.println(Arrays.toString(res));
        
    // }

    // private static char[] remove(char[] arr, char c) {
    //     char newarr[]=new char[arr.length-1];
    //     int ind=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]!=c){
    //             newarr[ind++]=arr[i];
    //         }
    //     }

    //     return newarr;
    // }

    // public static void main(String[] args) {
    //     String name="ssudeepe";
    //     StringBuilder res=new StringBuilder();
    //     for(int i=0;i<name.length();i++){
    //         char current=name.charAt(i);
    //         if(res.indexOf(String.valueOf(current))==-1){
    //             res.append(current);
    //         }
    //     }
    //     String ans=res.toString();
    //     System.out.println(ans);
    // }

        public static void main(String[] args) {
            String name="sudeep";
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<name.length();i++){
                char letter=name.charAt(i);
                if(sb.indexOf(String.valueOf(letter))==-1){   //string.value connvert the char to string 
                    sb.append(letter);
                }
            }
            System.out.println(sb.toString());
        }
}
