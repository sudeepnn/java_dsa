

public class soring_in_one_for_loop {
    public static void main(String[] args) {
        int ar[]={10,9,5,7,3,4},temp=0;
        for(int i=0;i<ar.length-1;i++){
           if(ar[i]>ar[i+1]){
             temp=ar[i];
            ar[i]=ar[i+1];
            ar[i+1]=temp;
            i=-1;
           }
        }
        for (int i : ar) {
            System.out.println(i);
        }
    }
    
}
