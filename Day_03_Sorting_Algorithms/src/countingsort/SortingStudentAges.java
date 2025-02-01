package countingsort;
import java.util.Arrays;

// Creating SortingStudentAges class to sort student ages using counting sort
public class SortingStudentAges
{
    // Method to implement counting sort
    public static void countingSort(int[] studentAges)
    {
        // Maximum age
        int maxAge = 29;
        // Minimum age
        int minAge = 11;

        // Create a count array to store the frequency of each ages
        int[] countfrequency = new int[maxAge - minAge + 1];
        for (int age : studentAges)
        {
            countfrequency[age - minAge]++;
        }

        int index = 0;
        for (int i = 0; i < countfrequency.length; i++)
        {
            while (countfrequency[i] > 0)
            {
                studentAges[index++] = i + minAge;
                countfrequency[i]--;
            }
        }
    }

    // Main method
    public static void main(String[] args)
    {
        int[] studentAges = {17,23,11,28,16,21,15,29};

        // Calling counting sort method
        countingSort(studentAges);

        // Displaying sorted student ages
        System.out.println("Sorted Student Ages are");
        System.out.println(Arrays.toString(studentAges));
    }
}
