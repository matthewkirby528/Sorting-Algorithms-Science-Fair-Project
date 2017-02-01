import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.scenario.effect.Merge;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

public class Main  {
    public static void main(String[] args) {

        Quicksort quicksort = new Quicksort();
        Mergesort mergesort = new Mergesort();
        Radix radixsort = new Radix();

        long start, end, elapsed;
        double elapsedInSeconds;
        int[] datasetRandomTenThousand = loadRandomArray(10000);
        int[] datasetRandomTenThousand2 = loadRandomArray(10000);
        int[] datasetRandomTenThousand3= loadRandomArray(10000);
        int[] datasetRandomOneHundredThousand = loadRandomArray(100000);
        int[] datasetRandomOneHundredThousand2 = loadRandomArray(100000);
        int[] datasetRandomOneHundredThousand3 = loadRandomArray(100000);
        int[] datasetRandomOneMillion = loadRandomArray(1000000);
        int[] datasetRandomOneMillion2 = loadRandomArray(1000000);
        int[] datasetRandomOneMillion3 = loadRandomArray(1000000);
        int[] sorted;


        int[] datasetBestCaseTenThousand = loadBestCaseArray(10000);
        int[] datasetBestCaseOneHundredThousand = loadBestCaseArray(100000);
        int[] datasetBestCaseOneMillion = loadBestCaseArray(1000000);

        //Bubble Sort:
        System.out.println("\t\t\t\t bubble sort \n ------------------------------------------------");
        System.out.println("Ten Thousand:");
        start = System.nanoTime();
        sorted = bubbleSort(datasetRandomTenThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = bubbleSort(datasetRandomTenThousand2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = bubbleSort(datasetRandomTenThousand3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);

        System.out.println("One Hundred Thousand:");
        start = System.nanoTime();
        sorted = bubbleSort(datasetRandomOneHundredThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = bubbleSort(datasetRandomOneHundredThousand2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = bubbleSort(datasetRandomOneHundredThousand3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);


        System.out.println("One Million");
        start = System.nanoTime();
        sorted = bubbleSort(datasetRandomOneMillion);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = bubbleSort(datasetRandomOneMillion2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = bubbleSort(datasetRandomOneMillion3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);

        System.out.println("Best Case(Thousand,Hundred Thousand, Million):");
        start = System.nanoTime();
        sorted = bubbleSort(datasetBestCaseTenThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = bubbleSort(datasetBestCaseOneHundredThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = bubbleSort(datasetBestCaseOneMillion);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);
        System.out.println("------------------------------------------------\n\n\n");

        //Insertion Sort
        System.out.println("\t\t\t\t insertion sort \n ------------------------------------------------");
        System.out.println("Ten Thousand:");
        start = System.nanoTime();
        sorted = insertionSort(datasetRandomTenThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = insertionSort(datasetRandomTenThousand2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = insertionSort(datasetRandomTenThousand3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);

        System.out.println("One Hundred Thousand:");
        start = System.nanoTime();
        sorted = insertionSort(datasetRandomOneHundredThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = insertionSort(datasetRandomOneHundredThousand2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = insertionSort(datasetRandomOneHundredThousand3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);


        System.out.println("One Million");
        start = System.nanoTime();
        sorted = insertionSort(datasetRandomOneMillion);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = insertionSort(datasetRandomOneMillion2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = insertionSort(datasetRandomOneMillion3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);

        System.out.println("Best Case(Thousand,Hundred Thousand, Million):");
        start = System.nanoTime();
        sorted = insertionSort(datasetBestCaseTenThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = insertionSort(datasetBestCaseOneHundredThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = insertionSort(datasetBestCaseOneMillion);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);
        System.out.println("------------------------------------------------\n\n\n");

        //Mergesort
        System.out.println("\t\t\t\t merge sort \n ------------------------------------------------");
        System.out.println("Ten Thousand:");
        start = System.nanoTime();
        sorted = mergesort.sort(datasetRandomTenThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = mergesort.sort(datasetRandomTenThousand2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = mergesort.sort(datasetRandomTenThousand3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);

        System.out.println("One Hundred Thousand:");
        start = System.nanoTime();
        sorted = mergesort.sort(datasetRandomOneHundredThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = mergesort.sort(datasetRandomOneHundredThousand2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = mergesort.sort(datasetRandomOneHundredThousand3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);


        System.out.println("One Million");
        start = System.nanoTime();
        sorted = mergesort.sort(datasetRandomOneMillion);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = mergesort.sort(datasetRandomOneMillion2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = mergesort.sort(datasetRandomOneMillion3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);

        System.out.println("Best Case(Thousand,Hundred Thousand, Million):");
        start = System.nanoTime();
        sorted = mergesort.sort(datasetBestCaseTenThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = mergesort.sort(datasetBestCaseOneHundredThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = mergesort.sort(datasetBestCaseOneMillion);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);
        System.out.println("------------------------------------------------\n\n\n");

        //Radix
        System.out.println("\t\t\t\t Radix \n ------------------------------------------------");
        System.out.println("Ten Thousand:");
        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetRandomTenThousand,datasetRandomTenThousand.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetRandomTenThousand2,datasetRandomTenThousand2.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetRandomTenThousand3, datasetRandomTenThousand3.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);

        System.out.println("One Hundred Thousand:");
        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetRandomOneHundredThousand, datasetRandomOneHundredThousand.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetRandomOneHundredThousand2, datasetRandomOneHundredThousand2.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetRandomOneHundredThousand3, datasetRandomOneHundredThousand3.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);


        System.out.println("One Million");
        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetRandomOneMillion, datasetRandomOneMillion.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetRandomOneMillion2,datasetRandomOneMillion2.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetRandomOneMillion3,datasetRandomOneMillion3.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);

        System.out.println("Best Case(Thousand,Hundred Thousand, Million):");
        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetBestCaseTenThousand, datasetBestCaseTenThousand.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetBestCaseOneHundredThousand,datasetBestCaseOneHundredThousand.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = radixsort.radixsort(datasetBestCaseOneMillion,datasetBestCaseOneMillion.length);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);
        System.out.println("------------------------------------------------\n\n\n");

        //Quicksort
        System.out.println("\t\t\t\t quicksort \n ------------------------------------------------");
        System.out.println("Ten Thousand:");
        start = System.nanoTime();
        sorted = quicksort.sort(datasetRandomTenThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = quicksort.sort(datasetRandomTenThousand2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = quicksort.sort(datasetRandomTenThousand3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);

        System.out.println("One Hundred Thousand:");
        start = System.nanoTime();
        sorted = quicksort.sort(datasetRandomOneHundredThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = quicksort.sort(datasetRandomOneHundredThousand2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = quicksort.sort(datasetRandomOneHundredThousand3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);


        System.out.println("One Million");
        start = System.nanoTime();
        sorted = quicksort.sort(datasetRandomOneMillion);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = quicksort.sort(datasetRandomOneMillion2);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = quicksort.sort(datasetRandomOneMillion3);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n\n",elapsedInSeconds);

        System.out.println("Best Case(Thousand,Hundred Thousand, Million):");
        start = System.nanoTime();
        sorted = quicksort.sort(datasetBestCaseTenThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = quicksort.sort(datasetBestCaseOneHundredThousand);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);

        start = System.nanoTime();
        sorted = quicksort.sort(datasetBestCaseOneMillion);
        end = System.nanoTime();
        elapsed = end - start;
        elapsedInSeconds = (double)elapsed /1000000000.0;
        System.out.printf("%.10f\n",elapsedInSeconds);
        System.out.println("------------------------------------------------\n\n\n");



    }




    private static int[] loadRandomArray(int arraySize){
        Random rand = new Random();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(10000000)+1;
        }
        return array;
    }

    private static int[] loadBestCaseArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = i;
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int q = 0; q < array.length; q++) {
            System.out.println(array[q]);

        }
    }



    private static int[] bubbleSort(int[] num) {
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < num.length-1; i++) {
                if (num[i] > num[i + 1]) {
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    flag = true;
                }
            }
        }



        return num;
    }


    private static int[] insertionSort(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;

    }


}
