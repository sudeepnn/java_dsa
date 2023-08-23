public class first_second_max {
    public static void main(String[] args) {
        int arr[]={9,10,2,5,1,0,4,3};
    int max=Integer.MIN_VALUE;
    int secmax=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            secmax=max;
            max=arr[i];
        }
        else if(arr[i]>secmax && arr[i]!=max){
            secmax=arr[i];
        }
    }
    if(secmax==Integer.MIN_VALUE)
    System.out.println(" no second max");
    else{
        System.out.println("MAx: "+max);
        System.out.println(" secound MAx: "+secmax);
    }
    }
}
