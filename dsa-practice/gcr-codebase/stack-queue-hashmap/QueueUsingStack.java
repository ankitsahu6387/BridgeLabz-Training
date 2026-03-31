import java.util.Stack;

class queue {
    Stack<Integer> stack1 = new Stack<>(); 
    Stack<Integer> stack2 = new Stack<>();

    //enqueue
    void enqueue (int data){
        stack1.push(data);
    }
    //dequeue
    int dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println(("Queue is empty"));
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int data = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return data;
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(40);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
    
}