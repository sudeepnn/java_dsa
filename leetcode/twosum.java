
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

public class twosum {
    
        public static int[] sum(int[] nums, int target) {
            int res[]=new int[2];
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(nums[i]+nums[j]==target && i!=j){   //if the array has 3,3 target is 6 ans should be 0,1 not 1 ,1
                        res[0]=i;
                        res[1]=j;
                    }
                }
            }
           
            return res;
        }
      
    public static void main(String[] args) {
        int ar[]={2,7,11,15};
        int res[]=sum(ar,9);
        for (int i : res) {
                System.out.println(i);
            }
        
        
        
    }
}
