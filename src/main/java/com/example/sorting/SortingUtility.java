package com.example.sorting;

public class SortingUtility {


    /**
     * Sorts an array using Gnome Sort algorithm.
     * Works like a garden gnome sorting flower pots - moves forward when in order,
     * moves backward swapping when out of order.
     *
     * @param a the array of Comparable objects to sort (modified in place)
     */
    public static <T extends Comparable<T>> void gnomeSort(T[] a) {
        // Initialize position to start of array
        int pos = 0;

        // Continue until we've processed the entire array
        while (pos < a.length) {
            // If at start or current element is >= previous element
            if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {
                // Move forward
                pos = pos + 1;
            } else {
                // Current element is smaller than previous, swap them
                swap(a, pos, pos - 1);
                // Move backward to check if we need to swap further back
                pos = pos - 1;
            }
        }
    }


    /**
     * Sorts an array using Cocktail Shaker Sort algorithm.
     * A bidirectional bubble sort that alternates direction each pass,
     * performing both forward and backward sweeps to move elements to their positions.
     *
     * @param a the array of Comparable objects to sort (modified in place)
     */
    public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {
        boolean swapped;

        // Continue until no swaps are made in a complete pass
        do {
            // Forward pass: bubble largest elements toward the end
            swapped = false;
            for (int i = 0; i < a.length - 1; i++) {
                // If current element is greater than next, swap them
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

            // If no swaps were made, array is sorted
            if (!swapped) {
                break;
            }

            // Backward pass: bubble smallest elements toward the start
            swapped = false;
            for (int i = a.length - 2; i >= 0; i--) {
                // If current element is greater than next, swap them
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }


    /**
     * Sorts an array using Shell Sort algorithm.
     * Uses Ciura gap sequence for improved performance.
     * Performs gapped insertion sorts with decreasing gap sizes.
     *
     * @param a the array of Comparable objects to sort (modified in place)
     */
    public static <T extends Comparable<T>> void shellSort(T[] a) {
        // Ciura gap sequence (optimal for most practical cases)
        int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1};
        int n = a.length;

        // Start with the largest gap and work down to a gap of 1
        for (int gap : gaps) {
            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                // Save a[i] in temp and make a hole at position i
                T temp = a[i];

                // Shift earlier gap-sorted elements up until the correct location for a[i] is found
                int j = i;
                while (j >= gap && a[j - gap].compareTo(temp) > 0) {
                    a[j] = a[j - gap];
                    j -= gap;
                }

                // Put temp (the original a[i]) in its correct location
                a[j] = temp;
            }
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





