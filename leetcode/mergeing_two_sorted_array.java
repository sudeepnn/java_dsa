

public class mergeing_two_sorted_array {
    public static int[] mergear(int num1[],int num2[]){
        int res[]=new int[num1.length+num2.length];
        int i=0,j=0,k=0;

        while(i<num1.length&&j<num2.length){
           
            if(num1[i]<num2[j]){
                res[k]=num1[i];
                i++;
                k++;
            }
            else{
                res[k]=num2[j];
                j++;
                k++;
            }
            
        }

        while(i<num1.length){
            res[k++]=num1[i++];
        }
        while(j<num2.length){
            res[k++]=num2[j++];
        }


        return res;

    }
    public static void main(String[] args) {
        int num1[]={1,2,3,4};
        int num2[]={2,5,6,7,8};
        


        int res[]=mergear(num1,num2);

        for (int i : res) {
            System.out.println(i);
        }
    }
    
}
