package me.ffulauh.dsaa.sort;

public class InsertionSort extends BaseSort{

    public static int[] insertionSort(int[] nums){
        int l=nums.length;
        for(int p=1;p<l-1;p++){
            for(int j=p;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int t=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=t;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{9,3,1,5,7,6};
        nums=insertionSort(nums);
        printNums(nums);
    }
}
