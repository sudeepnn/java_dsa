public class sum_of_two_number_is_res {
    public static void main(String[] args) {
        int ar[]={2,10,3,5,6,8,9,12,11,13};
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(ar[i]+ar[j]==16){
                    System.out.println(ar[i]+" "+ar[j]);
                }
            }
        }
    }
    
}
