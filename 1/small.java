class small {
    public static int findMin(int[] nums) {
        int low=0,high=nums.length-1,mid=0;
        while(low<=high){
          mid=(low+high)/2;
         if(nums[low]<nums[mid] && nums[low]<nums[high]){
             high=mid-1;
         }
         else if(nums[low]>nums[mid] && nums[low]>nums[high]){
             low=mid+1;
         }
        } 
        return nums[mid];
     }
    public static void main(String[] args) {
      

        // Example test cases
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {11, 13, 15, 17};

        System.out.println("Minimum in nums1: " + findMin(nums1)); // Output: 1
        System.out.println("Minimum in nums2: " + findMin(nums2)); // Output: 0
        System.out.println("Minimum in nums3: " + findMin(nums3)); // Output: 11
    }
}
