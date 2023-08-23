public class missing_no_in_array {
    public static void main(String[] args) {
        int input[]={1,9,2,3,4,8,0};
        int min=Integer.MAX_VALUE;
        int max=0;
        boolean flag=false;
        for(int i=0;i<input.length;i++){
            if(input[i]<min){
                min=input[i];
            }
            if(input[i]>max){
                max=input[i];
            }
        }
        System.out.println(min+" "+max);


        for(int i=min;i<=max;i++){
            flag=false;

            for(int j=0;j<input.length;j++){
                if(input[j]==i){

                    flag=true;  
                    
                    continue;
                }
            } 
            if(flag==false)
            System.out.println(i);
        }
    }
    
}
