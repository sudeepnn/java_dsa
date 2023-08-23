
public class first_seconf_minimum {
public static void main(String[] args) {
    int arr[]={9,10,2,5,1,0,4,3};
    int min=Integer.MAX_VALUE;
    int secmin=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            secmin=min;
            min=arr[i];
        }
        else if(arr[i]<secmin && arr[i]!=min){
            secmin=arr[i];
        }
    }
    if(secmin==Integer.MAX_VALUE)
    System.out.println("No second min");
    else{
        System.out.println("mininum: "+min);
        System.out.println("second mininum: "+secmin);
    }
    
}    
}
