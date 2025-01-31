package hashmapsandhashfunctions.twosumproblem;
import java.util.HashMap;

// Creating TwoSumProblem class to find indices which is equal to target
public class TwoSumProblem
{
    // Method to find indices
    public static int[] findingIndices(int[] array, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++)
        {
            int difference = target - array[i];

            if (map.containsKey(difference))
            {
                return new int[] { map.get(difference), i };
            }
            map.put(array[i], i);
        }
        return new int[] {};
    }

    // Main Method
    public static void main(String[] args)
    {
        int[] array = {3, 6, 8, 34, 65, 1, 9};
        int target = 4;

        int[] resultArray = findingIndices(array, target);

        if (resultArray.length == 0)
        {
            System.out.println("No solution.");
        }
        else
        {
            System.out.println("Indices is  [" + resultArray[0] + ", " + resultArray[1] + "]");
        }
    }
}
