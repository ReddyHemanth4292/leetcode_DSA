class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int n=digits.length;
        int last_dig=digits[n-1]+1;
        if(last_dig>9){
            digits[n-1]=last_dig%10;
            carry=1;
            for(int i=digits.length-2;i>=0;--i){
                if(carry==0) break;
                
                if(digits[i]+1<=9) carry=0;
                digits[i]=(digits[i]+1)%10;
            }
            
        }
        else{
            digits[n-1]=last_dig;
        }
        if(carry==1){
            int[] newarr= new int[digits.length+1];
            int j=digits.length-1;
            int k=newarr.length-1;
            while(j>=0){
                newarr[k]=digits[j];
                j--;
                k--;
            }
            newarr[k]=1;
            digits=newarr;
        }
        return digits;
    }
}
