package stacksandqueues.queueusingstacks;
import java.util.Stack;

// Creating QueueUsingStacks class to implement queue using two stack
public class QueueUsingStacks
{
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        // Method to add element in queue
        void enqueue(int x)
        {
            // Moving all element from stack1 to stack2
            while (!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }

            stack1.push(x);

            // Moving all element back to stack1
            while (!stack2.isEmpty())
            {
                stack1.push(stack2.pop());
            }
        }

        // Removing elements from a queue
        int dequeue()
        {
            if (stack1.isEmpty())
            {
                System.out.println("Queue is Empty");
                System.exit(0);
            }

            int x = stack1.peek();
            stack1.pop();
            return x;
        }

        // Main method
        public static void main(String[] args)
        {
            QueueUsingStacks queue = new QueueUsingStacks();

            // Calling enqueue method
            queue.enqueue(23);
            queue.enqueue(95);
            queue.enqueue(34);

            // Calling dequeue methods
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
        }
}
