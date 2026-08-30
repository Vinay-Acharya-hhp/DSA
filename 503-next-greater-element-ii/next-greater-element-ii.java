class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] arr=new int[nums.length];

        for(int i=2*nums.length-1;i>=0;i--){
            int inx=i%nums.length;
            while (!st.isEmpty() && nums[inx] >= st.peek()) {
                st.pop();
            }
            if(st.isEmpty()){
                arr[inx]=-1;
               
            }else{
                arr[inx]=st.peek();
                
            }
            st.push(nums[inx]);
        }
        return arr;
        
    }
}