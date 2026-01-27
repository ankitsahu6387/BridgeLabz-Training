class Solution {
    public int[] searchRange(int[] nums, int target) {
        int flag = 0;
        int arr[] = new int[2];
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                arr[0] = i;
                idx = i;
                flag++;
                break;
            }
        }
        for(int i=nums.length-1; i>=idx; i--){
            if(nums[i]==target){
                arr[1] = i;
                break;
            }
        }
        if(flag==0){
            arr[0] = -1;
            arr[1] = -1;
        }
        return arr;
    }
}