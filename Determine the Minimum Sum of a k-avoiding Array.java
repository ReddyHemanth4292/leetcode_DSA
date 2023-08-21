class Solution {
    public int minimumSum(int n, int k) {
        if(k/2>n) return n*(n+1)/2;
        else{
            int i=k/2;
            int j=k-1;
            int end=j+n-i;
            int sum=(i*(i+1))/2;
            int sum2=((end*(end+1))/2) - ((j*(j+1))/2);
            System.out.println(sum+" "+sum2);
            return sum+sum2;
        }
    }
}
