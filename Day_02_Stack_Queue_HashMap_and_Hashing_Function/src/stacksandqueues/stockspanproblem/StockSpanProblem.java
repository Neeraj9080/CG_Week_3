package stacksandqueues.stockspanproblem;
import java.util.Stack;

// Creating StockSpanProblem class to solve stock span problem using stack
public class StockSpanProblem
{
        // Method to calculate stock span
        public static int[] calculateSpan(int[] prices)
        {
            int n = prices.length;
            int[] span = new int[n];
            Stack<Integer> stack = new Stack<>();

            // Initialize the span of the first day to 1
            span[0] = 1;
            stack.push(0);

            for (int i = 1; i < n; i++)
            {
                while (!stack.isEmpty() && prices[i] >= prices[stack.peek()])
                {
                    stack.pop();
                }

                if(stack.isEmpty())
                    span[i] = i+1;
                else
                    span[i] = i - stack.peek();

                stack.push(i);
            }
            return span;
        }

        // Main method
        public static void main(String[] args)
        {
            int[] prices = {54, 37, 7, 10, 60, 42, 89};
            int[] span = calculateSpan(prices);

            System.out.println("Stock prices is ");
            for (int price : prices)
            {
                System.out.print(price + " ");
            }
            System.out.println();

            System.out.println("Span values is ");
            for (int value : span)
            {
                System.out.print(value + " ");
            }
        }
}

