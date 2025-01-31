package stacksandqueues.sortstackusingrecursion;
import java.util.Stack;

// Creating SortStackUsingRecursion class to sort a stack using recursion
public class SortStackUsingRecursion
{
        // Method to insert an element in a sorted stack
        static void insertSorted(Stack<Integer> stack, int element)
        {
            if (stack.isEmpty() || stack.peek() <= element)
            {
                stack.push(element);
                return;
            }

            int temp = stack.pop();
            insertSorted(stack, element);
            // Push the popped element back to the stack
            stack.push(temp);
        }

        // Function to sort the stack using recursion
        static void sortStack(Stack<Integer> stack)
        {
            if (stack.isEmpty())
            {
                return;
            }

            int temp = stack.pop();

            sortStack(stack);
            insertSorted(stack, temp);
        }

        // Main Method
        public static void main(String[] args)
        {
            Stack<Integer> stack = new Stack<>();

            // Adding elements to the stack
            stack.push(34);
            stack.push(3);;
            stack.push(98);
            stack.push(23);
            stack.push(4);

            System.out.println("Original stack is " + stack);
            sortStack(stack);
            System.out.println("Sorted stack is " + stack);
        }
}
