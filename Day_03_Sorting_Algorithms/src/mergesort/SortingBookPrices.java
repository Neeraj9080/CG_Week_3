package mergesort;
import java.util.Arrays;

// Creating SortingBookPrices class to sort book prices using merge sort
public class SortingBookPrices
{
    // Method to implement merge sort
    public static void mergeSort(int[] bookPrices, int left, int right)
    {
        int mid;
        if(left < right)
        {
            mid = left + (right - left) /2;

            mergeSort(bookPrices,left,mid);
            mergeSort(bookPrices,mid+1,right);
            merge(bookPrices,left,mid,right);
        }
    }

    // Method to merge the spilted arrays
    private  static void merge(int[] bookPrices,int left,int mid,int right)
    {
        int length1 = mid-left +1;
        int length2 = right - mid;

        int[] leftArray = new int[length1];
        int[] rightArray = new int[length2];

        System.arraycopy(bookPrices,left,leftArray,0,length1);
        System.arraycopy(bookPrices,mid+1,rightArray,0,length2);

        int i=0;
        int j=0;
        int k=left;

        while (i<length1 && j<length2)
        {
            if(leftArray[i] <= rightArray[j])
            {
                bookPrices[k++] = leftArray[i++];
            }
            else
            {
                bookPrices[k++] = rightArray[j++];
            }
        }
        while(i<length1)
        {
            bookPrices[k++] = leftArray[i++];
        }
        while(j<length2)
        {
            bookPrices[k++] = rightArray[j++];
        }
    }

    // Main method
    public static void main(String[] args)
    {
        int[] bookPrices = {600,100,750,450,900,250,50};

        // Calling merge sort method
        mergeSort(bookPrices,0,bookPrices.length-1);

        // Displaying sorted book price
        System.out.println("Sorted Book Prices are");
        System.out.println(Arrays.toString(bookPrices));
    }
}
