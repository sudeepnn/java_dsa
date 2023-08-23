public class remove_duplicate_sorted_array {
    public  static int removeDuplicates(int[] nums) {
        int j=0;
        int res[]=new int[nums.length];
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==res[j]){
                continue;
            }
            else{
                res[++j]=nums[i];
            }
        
        }
        for(int i=0;i<=j;i++){
           nums[i]=res[i];
        }
        for(int i=0;i<nums.length;i++){
           System.out.println(nums[i]);
        }
        return j;
        
    }
    public static void main(String[] args) {
        int ar[]={0,1,1,1,2,2,3,3,4};
        int res=removeDuplicates(ar);
        System.out.println(res);
    }
}
