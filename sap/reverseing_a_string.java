public class reverseing_a_string {
    public static void main(String[] args) {
        String name="somename";
        char ar[]=name.toCharArray();
        int i=0;
        int j=name.length()-1;
        while(i<j){
            char temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }
       for (char c : ar) {
        System.out.println(c);
       }
    }
}
