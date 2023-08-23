public class remove_the_number {
    public static int removeElement(int[] nums, int val) {
        int count=0,step=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++; 

                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                    nums[j+1 ]='_';
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);
         return 1;
    }
    public static void main(String[] args) {
        int ar[]={0,1,2,2,3,0,4,2},val=2;
        int res=removeElement(ar, val);
        System.out.println(res);
    }
    
}
