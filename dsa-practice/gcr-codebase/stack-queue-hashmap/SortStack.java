import java.util.Stack;

class SortStack {

    static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        sortStack(st);
        insertSorted(st, top);
    }
    static void insertSorted(Stack<Integer> st, int x) {
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        insertSorted(st, x);
        st.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(2);
        st.push(5);
        sortStack(st);
        System.out.println(st); // [5, 10, 20, 30]
    }
}
