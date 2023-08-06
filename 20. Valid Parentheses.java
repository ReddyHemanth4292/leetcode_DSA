class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        if(n%2==1){
            return false;
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                stack.add(s.charAt(i));
            }
            else{
                if(stack.isEmpty()) return false;

                if(s.charAt(i)=='}' && stack.peek()=='{' || s.charAt(i)==']' && stack.peek()=='[' || s.charAt(i)==')' && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
