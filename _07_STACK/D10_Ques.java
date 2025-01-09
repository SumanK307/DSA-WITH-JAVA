package _07_STACK;

import java.util.*;

public class D10_Ques {
    public static void Print(int[] arr,int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void removeAllDuplicate(int[] arr,int n){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(st.size() == 0 || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else if(arr[i]==st.peek() ){
                if(i==n-1 || arr[i]!=arr[i+1])
                    st.pop();
            }
        }
        // int[] res = new int[st.size()];
        // int m = res.length;
        // for (int i = m-1; i >= 0; i--) {
        //     res[i] = st.pop();
        // }
        // return res;
        System.out.println(st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number:");
            int n = sc.nextInt();
            int[] arr = new int[n]; 
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Print(arr, n);
            //int[] res = removeAllDuplicate(arr, n);
            removeAllDuplicate(arr, n);
            //Print(res, res.length);
    }
}
