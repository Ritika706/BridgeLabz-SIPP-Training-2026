package main.java.DSA.Scenerio_Based.Queue;


import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int nums[],int k){

        int n=nums.length;

        int ans[]=new int[n-k+1];

        Deque<Integer> dq=new ArrayDeque<>();

        int index=0;

        for(int i=0;i<n;i++){

            while(!dq.isEmpty() &&
                    dq.peekFirst()<=i-k){

                dq.pollFirst();
            }

            while(!dq.isEmpty() &&
                    nums[dq.peekLast()]<nums[i]){

                dq.pollLast();
            }

            dq.offerLast(i);

            if(i>=k-1){

                ans[index++]=nums[dq.peekFirst()];
            }
        }

        return ans;
    }

    public static void main(String[] args){

        int nums[]={1,3,-1,-3,5,3,6,7};

        int ans[]=maxSlidingWindow(nums,3);

        for(int x:ans)
            System.out.print(x+" ");
    }
}