// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

// import java.util.HashMap;
// import java.util.Map;

public class majority_element {
     public static int majorityElement(int[] nums) {
        //  HashMap<Integer,Integer> map=new HashMap<>();
        //  int max=0,i=0,ans=0;
        // for (int ans1 :nums ) {
        //     if(map.containsKey(ans1)){
        //     int value=map.get(ans1);
        //     map.put(ans1,++value);
        //     }
        //     else
        //     map.put(ans1,1);
            
        // }
        // for ( Map.Entry<Integer,Integer> e:  map.entrySet()) {
        //     if(e.getValue()>max){
        //     max=e.getValue();
        //     ans=e.getKey();
        //     }
        // }
        
        // return ans;




            int cadidate=0,point=0;
            for(int i=0;i<nums.length;i++){
                if(point==0){
                    cadidate=nums[i];

                }
                if(cadidate==nums[i]){
                    point++;
                }
                else{
                    point--;
                }
            }


        return cadidate;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
       
    }
    
}
