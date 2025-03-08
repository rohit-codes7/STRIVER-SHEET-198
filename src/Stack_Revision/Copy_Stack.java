package Stack_Revision;

import java.util.Stack;

public class Copy_Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(45);
        st.push(98);
        st.push(22);
        System.out.println("Stack st");
        System.out.println(st);
//        st.pop();
//        System.out.println(st);


        // Copy Stack
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
             rt.push(st.pop());
        }
        System.out.println("Stack rt");
        System.out.println(rt);

        Stack<Integer> gt =new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println("Stack gt");
        System.out.println(gt);
    }


}
