public class RotateArray {
    static void PrintArray(int []nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
     static int[] Rotate(int[] nums, int k) {
        int n=nums.length;
        int []ans=new int[n];
        for(int i=0;i<k;i++){
            ans[i]=nums[n-k+i];
        }
        for(int i=k;i<n;i++){
            ans[i]=nums[i-4];
        }
        return ans;
    }
        public static void main(String[] args) {
            int[] nums={25,26,27,28,29,30,31,32,33,34};
            int [] result=new int[nums.length];
             result=Rotate(nums,4);
            System.out.println();
            PrintArray(result);
        }
    }



        
