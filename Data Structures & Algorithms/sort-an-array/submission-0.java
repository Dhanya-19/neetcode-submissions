class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }
    int [] mergeSort(int[] nums){

        if(nums.length<=1){
                return nums;
            }
            int mid=nums.length/2;
            int[] left=new int[mid];
            int[] right=new int[nums.length-mid];
            for(int i=0;i<mid;i++){
                left[i]=nums[i];
            }
            for(int i=0;i<right.length;i++){
                right[i]=nums[mid+i];
            }
            left=mergeSort(left);
            right=mergeSort(right);
            return merge(left,right);
        }
        int [] merge(int[] left, int [] right){
            int i=0,j=0,k=0;
            int [] result=new int[left.length+right.length];
            while(i<left.length&&j<right.length){
                if(left[i]<=right[j]){
                    result[k]=left[i];
                    i++;
                }
                else{
                    result[k]=right[j];
                    j++;
                }
                k++;
            }
            while(i<left.length){
                result[k]=left[i];
                i++;
                k++;
            }
            while(j<right.length){
                result[k]=right[j];
                j++;
                k++;
            }
        return result;
        }
}