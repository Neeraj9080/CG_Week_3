package insertionsort;
import java.util.Arrays;

// Creating SortingEmployeeIDs class to sort employee id using insertion sort
public class SortingEmployeeIDs
{
    // Method to implement insertion sort
    public static void insertionSort(int[] employeeIds)
    {
        int length = employeeIds.length;
        for(int i=0;i<length;i++)
        {
            int key = employeeIds[i];
            int j = i-1;

            while(j>=0 && employeeIds[j]>key)
            {
                employeeIds[j+1] = employeeIds[j];
                j--;
            }
            employeeIds[j+1] = key;

        }
    }

    // Main method
    public static void main(String[] args)
    {
        int[] employeeIds = {146, 103, 135, 127, 186, 46, 119};

        // Calling the insertionSort method
        insertionSort(employeeIds);

        // Displaying the sorted employee Ids
        System.out.println("Sorted Employee Ids are ");
        System.out.println(Arrays.toString(employeeIds));
    }
}
