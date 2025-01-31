package hashmapsandhashfunctions.longestconsecutivesequence;
import java.util.HashSet;

// Creating LongestConsecutiveSequence class to find longest consecutive sequence in array
public class LongestConsecutiveSequence
{
    // Method to find longest consecutive sequence
    public static int findingLongestConsecutiveSequence(int[] arrays)
    {
        HashSet<Integer> arraySet = new HashSet<>();
        for (int arr : arrays)
        {
            arraySet.add(arr);
        }
        int longest = 0;

        for (int arr : arrays)
        {
            if (!arraySet.contains(arr - 1))
            {
                int currentNumber = arr;
                int currentLength = 1;

                // Check for consecutive numbers
                while (arraySet.contains(currentNumber + 1))
                {
                    currentNumber++;
                    currentLength++;
                }
                longest = Math.max(longest, currentLength);
            }
        }
        return longest;
    }

    // Main method
    public static void main(String[] args)
    {
        int[] arrays = {11,3,67,2,1,89,54};

        int length = findingLongestConsecutiveSequence(arrays);
        System.out.println("Length of longest consecutive sequence is " + length);
    }
}
