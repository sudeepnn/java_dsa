public class selection_sort {
    public static void main(String[] args) {
        int ar[]={2,1,0,5,3,6,8,4,3};
        int minind,temp;
        for(int i=0;i<ar.length-1;i++){
            minind=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[minind])
                minind=j;
            }
            temp=ar[i];
            ar[i]=ar[minind];
            ar[minind]=temp;
        }

        for (int i : ar) {
            System.out.println(i);
        }
    }
    
}
