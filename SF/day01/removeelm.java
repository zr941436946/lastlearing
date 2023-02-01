package day01;

public class removeelm {
    public static void main(String[] args) {
        int[] nums={2};
        removeelm removeelm = new removeelm();
        int p = removeelm.remove4(nums, 3);
        System.out.println(p);

    }

    //版本1左闭右闭
    public int remove1(int[] nums, int target){
        int len=nums.length;
        int left=0,right=len-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    //版本二左闭右开
    public int remove2(int[] nums,int target){
        int len=nums.length;
        int left=0,right=len-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }

    //数组的移除--暴力解法
    public int remove3(int[] nums,int val){
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]==val){
                for(int j=i+1;j<len;j--){
                    nums[j-1]=nums[j];
                }
                i--;
                len--;
            }
        }
        return len;
    }

    //数组的移除--双指针法
    public int remove4(int[] nums,int val){
        int slow=0,len=nums.length;
        for(int fast=0;fast<len;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
            }
            fast++;
            slow++;
        }
        return slow;

    }

}
