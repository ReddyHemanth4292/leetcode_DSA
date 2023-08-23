import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> mystack=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int a2=mystack.pop();
                int a1=mystack.pop();
                mystack.push(a1);
                mystack.push(a2);
                mystack.push(a1+a2);
            }
            else if(operations[i].equals("D")){
                int b1=mystack.peek();
                mystack.push(b1*2);
            }
            else if(operations[i].equals("C")){
                mystack.pop();
            }
            else  {
                mystack.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        while(!mystack.isEmpty()){
            sum+=mystack.pop();
        }

        return sum;
    }
}
