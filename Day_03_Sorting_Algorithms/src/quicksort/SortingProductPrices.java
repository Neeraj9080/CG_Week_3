package quicksort;
import java.util.Arrays;

// Creating SortingProductPrices class to sort product prices using quick sort algorithm
public class SortingProductPrices
{
    // Method to implement quick sort
    public static void quickSort(int[] productPrices, int low, int high)
    {
        if(low < high)
        {
            int pi = partition(productPrices, low, high);
            quickSort(productPrices, low, pi -1);
            quickSort(productPrices, pi +1, high);
        }
    }

    // Method to partition the array around the pivot element
    private static int partition(int[] productPrices, int low, int high)
    {
        int pivot = productPrices[high];
        int i = low - 1;
        for(int j=low; j<high; j++)
        {
            if(productPrices[j] < pivot)
            {
                i++;
                int temp = productPrices[i];
                productPrices[i] = productPrices[j];
                productPrices[j] = temp;
            }
        }
        int temp = productPrices[i+1];
        productPrices[i+1] = productPrices[high];
        productPrices[high] = temp;
        return i+1;
    }

    // Main method
    public static void main(String[] args)
    {
        int[] productPrices = {50,70,40,55,90,10,35};

        // Calling quick sort method
        quickSort(productPrices,0,productPrices.length-1);

        // Displaying the sorted product prices
        System.out.println("Sorted Product Prices are ");
        System.out.println(Arrays.toString(productPrices));
    }
}
