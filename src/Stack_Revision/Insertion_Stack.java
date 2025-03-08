package Stack_Revision;

import java.util.Stack;

public class Insertion_Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx = 2;
        int x = 2;
        Stack<Integer> temp = new Stack<>();
        while (st.size()>idx){
            temp.push(st.pop());
        }
        System.out.println(temp);





    }
}
