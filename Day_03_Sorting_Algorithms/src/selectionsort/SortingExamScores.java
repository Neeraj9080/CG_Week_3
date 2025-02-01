package selectionsort;
import java.util.Arrays;

// Creating SortingExamScores class to sort exam scores using selection sort
public class SortingExamScores
{
    // Method to implement selection sort
    public static void selectionSort(int[] examScores)
    {
        int length = examScores.length;
        for (int i = 0; i < length - 1; i++)
        {
            // Find the minimum element in unsorted array
            int minimumIndex = i;
            for (int j = i + 1; j < length; j++)
            {
                if (examScores[j] < examScores[minimumIndex])
                {
                    minimumIndex = j;
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = examScores[minimumIndex];
            examScores[minimumIndex] = examScores[i];
            examScores[i] = temp;
        }
    }
    // Main method
    public static void main(String[] args)
    {
        int[] examScores = {67, 45, 17, 78, 95, 88};

        // Calling selection sort method
        selectionSort(examScores);

        // Displaying sorted exam scores
        System.out.println("Sorted Exam Scores are ");
        System.out.println(Arrays.toString(examScores));
    }
}
