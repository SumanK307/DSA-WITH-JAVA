package _07_STACK;

public class D06_LLImp {
    public static void main(String[] args) {
    LLStack st = new LLStack();
        st.push(4);
        st.push(3);
        st.push(7);
        st.push(9);
        st.display(st.head);
        System.out.println();
        System.out.println(st.pop());        
        st.display(st.head);
        System.out.println();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
