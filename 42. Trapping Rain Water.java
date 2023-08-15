class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                left[i]=height[i];
                right[n-1]=height[n-1];
            }
            else{
                left[i]=Math.max(height[i],left[i-1]);
                right[n-i-1]=Math.max(height[n-i-1],right[n-i]);
            }
        }
        for(int i=0;i<n;i++){
            if(left[i]>right[i]) left[i]=right[i];
        }
        for(int i=0;i<n;i++){
            height[i]=Math.abs(height[i]-left[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans+height[i];
        }
        return ans;
    }
}
