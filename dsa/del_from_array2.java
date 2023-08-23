package dsa;
//removing the element ehen postion is passed modifying same array by storing the nexteleement in pervious posion
import java.util.Arrays;

public class del_from_array2 {
    public static void main(String[] args) {
         int arr[]=new int[]{10,20,30,40,50};
        int  newarry[]=remove(arr,2);

        System.out.println("original array: "+Arrays.toString(arr));
        System.out.println("Final array: "+Arrays.toString(newarry));
    }
    public static int[] remove(int arry[],int pos){
        int i=0;
        for( i=pos-1;i<arry.length-1;i++){
            arry[i]=arry[i+1];        
        }
       
        return arry;
    }
    
}
