public class bubble_sort {
    public static void main(String[] args) {
        int ar[]={5,4,3,2,1};
        for(int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-1;j++){
               if(ar[j]<ar[j+1]){
                 int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
               }
            }
        }
    for (int i : ar) {
        System.out.print(i);
    }
    }
    
}
