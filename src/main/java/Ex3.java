import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);

        Stack<Integer> single = new Stack<>();
        single.push(10);
        reverseStack(single);
        System.out.println(single);
    }

    public static void reverseStack(Stack<Integer> st) {
        Stack<Integer> tempStack = new Stack<>();
        while (!st.isEmpty()) {
            tempStack.push(st.pop());
        }
        Stack<Integer> tempStackTemp = new Stack<>();
        while (!tempStack.isEmpty()) {
            tempStackTemp.push(tempStack.pop());
        }
        while (!tempStackTemp.isEmpty()) {
            st.push(tempStackTemp.pop());
        }
    }
}
