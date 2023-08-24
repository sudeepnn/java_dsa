public class arraging_odd_even {
    public static void main(String[] args) {
        int ar[]={6,2,1,4,5,8,2,4,7,3,4,0};
        int i=0,j=ar.length-1,temp;
        while(i<j){
            while(ar[i]%2==0){
                i++;
            }
            while(ar[j]%2!=0){
                j--;
            }
            temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }
        for (int k : ar) {
            System.out.println(k);
        }
    }
}
