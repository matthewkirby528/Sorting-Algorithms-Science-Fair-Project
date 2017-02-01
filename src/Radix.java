import java.util.Arrays;

/**
 * Created by mkirby528 on 2/1/2017.
 */
public class Radix {

    static int getMax(int[] values, int length)
    {
        int max = values[0];
        for (int i = 1; i < length; i++)
            if (values[i] > max)
                max = values[i];
        return max;
    }

   /*  A function to do counting sort of values[] according to
     the digit represented by exp.*/
    static void countSort(int[] values, int length, int exp)
    {
        int[] output = new int[length];
        int i;
        int[] count = new int[10];
        Arrays.fill(count,0);

//         Store count of occurrences in count[]
        for (i = 0; i < length; i++)
            count[ (values[i]/exp)%10 ]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = length - 1; i >= 0; i--)
        {
            output[count[ (values[i]/exp)%10 ] - 1] = values[i];
            count[ (values[i]/exp)%10 ]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < length; i++)
            values[i] = output[i];
    }

    // The main function to that sorts values[] of size n using
    // Radix Sort
    static int[] radixsort(int values[], int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(values, n);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(values, n, exp);
        return values;
    }

    // A utility function to print an array



    /*Driver function to check for above function*/
    public static void main (String[] args)
    {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;
        radixsort(arr, n);
       // print(arr, n);
    }
}


