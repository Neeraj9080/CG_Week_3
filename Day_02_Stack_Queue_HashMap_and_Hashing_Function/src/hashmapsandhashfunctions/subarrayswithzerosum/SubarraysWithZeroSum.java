package hashmapsandhashfunctions.subarrayswithzerosum;
import java.util.*;

// Creating SubarraysWithZeroSum class to find subarrays whose sum is zero
public class SubarraysWithZeroSum
{
    // Method to find sum of subarrays whose sum is zero
    public static List<List<Integer>> findingZeroSumSubarrays(int[] array)
    {
        List<List<Integer>> subArrayList = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
            if (map.containsKey(sum))
            {
                List<Integer> indices = map.get(sum);
                for (int index : indices)
                {
                    subArrayList.add(new ArrayList<>(Arrays.asList(index + 1, i)));
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        return subArrayList;
    }

    // Main method
    public static void main(String[] args)
    {
        int[] array = {2, -34, 34, -2, 37, -1, 45, -45};

        List<List<Integer>> subArrays = findingZeroSumSubarrays(array);

        System.out.println("SubArrays with zero sum is ");
        for (List<Integer> subArray : subArrays)
        {
            System.out.println(subArray);
        }
    }
}
