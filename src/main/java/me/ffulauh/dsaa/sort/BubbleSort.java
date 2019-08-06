package me.ffulauh.dsaa.sort;

public class BubbleSort extends BaseSort{

    public static void main(String[] args) {
        int[] nums=new int[]{9,3,1,5,7,6};
        nums=bubbleSort(nums);
        printNums(nums);
    }
    //时间复杂度O(n2) 稳定排序
    public static int[] bubbleSort(int[] nums){
        int l=nums.length;
        for(int i=0;i<l-1;i++){
            //确定j的范围：j+1<l，因为i可以为0,所以j<l-1-i
            for(int j=0;j<l-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
