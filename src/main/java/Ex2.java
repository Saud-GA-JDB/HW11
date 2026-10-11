public class Ex2 {
    public static void main(String[] args) {
        System.out.println(expressionBalancingUsingStack("{[()]}"));
        System.out.println(expressionBalancingUsingStack("([)]"));
    }

    public static boolean expressionBalancingUsingStack(String msg) {
        SingleArrayStack st = new SingleArrayStack(msg.length());

//        String[] exp = msg.split("");
        for (char e : msg.toCharArray()) {
            if (e == '(' || e == '{' || e == '[') st.push(e);
            else if (e == ')' || e == '}' || e == ']') {
                if (st.isEmpty()) return false;
                char top = st.top();
                if ((e == ')' && top != '(') || (e == '}' && top != '{') || (e == ']' && top != '[')) return false;
                st.pop();
            }
        }
        if (st.isEmpty()) return true;
        return false;
    }
}
