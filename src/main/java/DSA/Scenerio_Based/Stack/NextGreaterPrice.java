package main.java.DSA.Scenerio_Based.Stack;


import java.util.Stack;

public class NextGreaterPrice {

    public static int[] nextGreater(int[] price) {

        int n=price.length;

        int ans[]=new int[n];

        Stack<Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--) {

            while(!st.isEmpty() && st.peek()<=price[i]) {
                st.pop();
            }

            if(st.isEmpty())
                ans[i]=-1;
            else
                ans[i]=st.peek();

            st.push(price[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int price[]={100,80,60,70,60,75,85};

        int ans[]=nextGreater(price);

        for(int x:ans)
            System.out.print(x+" ");

    }
}