package stacksandqueues.slidingwindowmaximum;
import java.util.LinkedList;
import java.util.Deque;

// Creating SlidingWindowMaximum class to find maximum element in given subarray size
public class SlidingWindowMaximum
{
        // Method to find maximum element in given subarray size
        public static int[] maxSlidingWindow(int[] array, int x)
        {
            if (array == null || x <= 0)
            {
                return new int[0];
            }

            int length = array.length;
            int[] result = new int[length - x + 1];
            int index = 0;
            Deque<Integer> deque = new LinkedList<>();

            for (int i = 0; i < length; i++)
            {
                // Remove elements not within the window
                while (!deque.isEmpty() && deque.peekFirst() < i - x + 1) {
                    deque.pollFirst();
                }

                // Remove elements smaller than the current element from the back
                while (!deque.isEmpty() && array[deque.peekLast()] < array[i])
                {
                    deque.pollLast();
                }

                // Adding the current element's index at the back of the deque
                deque.offerLast(i);
                if (i >= x - 1)
                {
                    result[index++] = array[deque.peekFirst()];
                }
            }
            return result;
        }

        // Main method
        public static void main(String[] args)
        {
            int[] array = {19, 24, 10, 34, 56, 22};
            int x = 3;
            int[] result = maxSlidingWindow(array, x);

            System.out.println("Sliding window maximums is ");
            for (int max : result)
            {
                System.out.println(max);
            }
        }
}
