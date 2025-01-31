package hashmapsandhashfunctions.checkpairsuminarray;
import java.util.HashSet;

// Creating CheckPairSumInArray class to find pair which is equal to target
public class CheckPairSumInArray
{
    // Method to find pair that is equal target
    public static boolean findingPair(int[] arr, int target)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        int length = arr.length;

        for(int i=0; i<length; i++)
        {
            int difference = target - arr[i];
            if (hashSet.contains(difference))
            {
                return true;
            }
            hashSet.add(arr[i]);
        }

        return false;
    }

    // Main method
    public static void main(String[] args)
    {
        int[] arr = {67, 9, 3, 2, 3, 45, 1};
        int target = 10;

        boolean result = findingPair(arr, target);

        if(result)
            System.out.println("Pair with given sum found");
        else
            System.out.println("Pair with given sum not found");
    }
}
