package com.example.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive unit tests for sorting algorithms.
 * Tests each algorithm with various input patterns and data types.
 */
public class SortingUtilityTest {

    // ========== GNOME SORT TESTS ==========

    @Test
    void testGnomeSort_EmptyArray() {
        Integer[] arr = {};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{}, arr);
    }

    @Test
    void testGnomeSort_SingleElement() {
        Integer[] arr = {5};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{5}, arr);
    }

    @Test
    void testGnomeSort_AlreadySorted() {
        Integer[] arr = {1, 2, 3, 4, 5};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testGnomeSort_ReverseSorted() {
        Integer[] arr = {5, 4, 3, 2, 1};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testGnomeSort_Duplicates() {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, arr);
    }

    @Test
    void testGnomeSort_AllSame() {
        Integer[] arr = {5, 5, 5, 5, 5};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5}, arr);
    }

    @Test
    void testGnomeSort_TwoElementsSwapped() {
        Integer[] arr = {2, 1};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    void testGnomeSort_TwoElementsSorted() {
        Integer[] arr = {1, 2};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    void testGnomeSort_RandomOrder() {
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }

    @Test
    void testGnomeSort_Strings() {
        String[] arr = {"zebra", "apple", "mango", "banana"};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, arr);
    }

    @Test
    void testGnomeSort_NegativeNumbers() {
        Integer[] arr = {-5, 3, -1, 0, 8, -10};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{-10, -5, -1, 0, 3, 8}, arr);
    }

    // ========== COCKTAIL SHAKER SORT TESTS ==========

    @Test
    void testCocktailShakerSort_EmptyArray() {
        Integer[] arr = {};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{}, arr);
    }

    @Test
    void testCocktailShakerSort_SingleElement() {
        Integer[] arr = {5};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{5}, arr);
    }

    @Test
    void testCocktailShakerSort_AlreadySorted() {
        Integer[] arr = {1, 2, 3, 4, 5};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testCocktailShakerSort_ReverseSorted() {
        Integer[] arr = {5, 4, 3, 2, 1};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testCocktailShakerSort_Duplicates() {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, arr);
    }

    @Test
    void testCocktailShakerSort_AllSame() {
        Integer[] arr = {5, 5, 5, 5, 5};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5}, arr);
    }

    @Test
    void testCocktailShakerSort_TwoElementsSwapped() {
        Integer[] arr = {2, 1};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    void testCocktailShakerSort_TwoElementsSorted() {
        Integer[] arr = {1, 2};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    void testCocktailShakerSort_RandomOrder() {
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }

    @Test
    void testCocktailShakerSort_Strings() {
        String[] arr = {"zebra", "apple", "mango", "banana"};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, arr);
    }

    @Test
    void testCocktailShakerSort_NegativeNumbers() {
        Integer[] arr = {-5, 3, -1, 0, 8, -10};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{-10, -5, -1, 0, 3, 8}, arr);
    }

    @Test
    void testCocktailShakerSort_NearlySorted() {
        // Tests bidirectional behavior - small element at end needs backward pass
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, arr);
    }

    // ========== SHELL SORT TESTS ==========

    @Test
    void testShellSort_EmptyArray() {
        Integer[] arr = {};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{}, arr);
    }

    @Test
    void testShellSort_SingleElement() {
        Integer[] arr = {5};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{5}, arr);
    }

    @Test
    void testShellSort_AlreadySorted() {
        Integer[] arr = {1, 2, 3, 4, 5};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testShellSort_ReverseSorted() {
        Integer[] arr = {5, 4, 3, 2, 1};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testShellSort_Duplicates() {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, arr);
    }

    @Test
    void testShellSort_AllSame() {
        Integer[] arr = {5, 5, 5, 5, 5};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5}, arr);
    }

    @Test
    void testShellSort_TwoElementsSwapped() {
        Integer[] arr = {2, 1};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    void testShellSort_TwoElementsSorted() {
        Integer[] arr = {1, 2};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    void testShellSort_RandomOrder() {
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }

    @Test
    void testShellSort_Strings() {
        String[] arr = {"zebra", "apple", "mango", "banana"};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, arr);
    }

    @Test
    void testShellSort_NegativeNumbers() {
        Integer[] arr = {-5, 3, -1, 0, 8, -10};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{-10, -5, -1, 0, 3, 8}, arr);
    }

    @Test
    void testShellSort_LargeArray() {
        // Test with larger array to exercise gap sequence
        Integer[] arr = {50, 23, 9, 18, 61, 32, 19, 35, 42, 88, 4,
                        67, 2, 77, 11, 29, 93, 55, 71, 15};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{2, 4, 9, 11, 15, 18, 19, 23, 29, 32,
                                       35, 42, 50, 55, 61, 67, 71, 77, 88, 93}, arr);
    }
}
