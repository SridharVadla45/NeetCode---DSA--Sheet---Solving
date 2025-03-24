package src.heaps.largestdigitafterparity;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Solution {
    public int largestInteger(int num) {
        int temp =num;
        // maintain two pq for odd and even if digit is even pop from even else from odd
        PriorityQueue<Integer> evenPq = new PriorityQueue<>(((o1, o2) -> o2-o1));
        PriorityQueue<Integer> oddPq = new PriorityQueue<>(((o1, o2) -> o2-o1));
        Stack<Integer> stack = new Stack<>();
        while(temp!=0){
            int digit = temp%10;
            if((digit &1)==1){
                oddPq.offer(digit);
                stack.add(0);
            }
            else{
                evenPq.offer(digit);
                stack.add(1);
            }
            temp/=10;
        }
        int result =0;
        while(!stack.isEmpty()){
            int flag = stack.pop();
            if(flag==1 && !evenPq.isEmpty())
                result= result*10+evenPq.poll();
            else if (!oddPq.isEmpty()) {
                result= result*10+oddPq.poll();
            }
        }

        return 0;
    }
}
