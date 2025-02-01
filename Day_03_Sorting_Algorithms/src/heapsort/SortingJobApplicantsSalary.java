package heapsort;
import java.util.Arrays;

// Creating SortingJobApplicantsSalary class to sort salaries of job applicants using heap sort
public class SortingJobApplicantsSalary
{
    // Method to implement heap sort
    public static void heapSort(int[] salaries)
    {
        int length = salaries.length;

        // Building a Max Heap
        for (int i = length / 2 - 1; i >= 0; i--)
        {
            heapify(salaries, length, i);
        }

        for (int i = length - 1; i > 0; i--)
        {
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            heapify(salaries, i, 0);
        }
    }

    // Method to perform heapify operation
    public static void heapify(int[] salaries, int length, int index)
    {
        int max = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        // If left child is larger than root
        if (left < length && salaries[left] > salaries[max])
        {
            max = left;
        }

        // If right child is larger than root
        if (right < length && salaries[right] > salaries[max])
        {
            max = right;
        }

        if (max != index)
        {
            int temp = salaries[index];
            salaries[index] = salaries[max];
            salaries[max] = temp;
            heapify(salaries, length, max);
        }
    }

    // Main method
    public static void main(String[] args)
    {
        int[] salaries = {100000, 35000, 87000, 25000, 15000, 75000};

        // Calling heap sort method
        heapSort(salaries);

        // Displaying sorted salaries of job applicants
        System.out.println("Sorted Salaries are ");
        System.out.println(Arrays.toString(salaries));
    }
}
