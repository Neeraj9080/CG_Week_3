package bubblesort;
import java.util.Arrays;

// Creating SortingStudentMarks class to sort student marks using bubble sort
public class SortingStudentMarks
{

    // Method to implement Bubble Sort
    public static void bubbleSort(int[] studentMarks)
    {
        int length = studentMarks.length;
        boolean swapped;

        // Traversing all elements in the array
        for (int i = 0; i < length - 1; i++)
        {
            swapped = false;
            for (int j = 0; j < length - 1 - i; j++)
            {
                if (studentMarks[j] > studentMarks[j + 1])
                {
                    // Swapping the elements
                    int temp = studentMarks[j];
                    studentMarks[j] = studentMarks[j + 1];
                    studentMarks[j + 1] = temp;
                    swapped = true;
                }
            }
            // If swapping not occur in the inner loop, then the array is already sorted
            if (!swapped)
            {
                break;
            }
        }
    }

    // Main Method
    public static void main(String[] args)
    {
        int[] studentMarks = {98, 33, 83, 17, 95, 46, 67};

        // Calling the bubbleSort method
        bubbleSort(studentMarks);

        // Displaying the sorted student marks
        System.out.println("Sorted Student Marks are ");
        System.out.println(Arrays.toString(studentMarks));
    }
}
