package com.sssm.search.binarysearch;

// for Binary Search, the source must be sorted.
public class BinarySearch1 {

	public static void main(String[] args) {
		final int[] array = new int[] { 4, 5, 6, 7, 8, 9 };
		if (isFound(array, 5)) {
			System.out.println("Found!!");
		} else {
			System.out.println("Not Found!!");
		}
	}

	private static boolean isFound(final int[] array, int valueToSearch) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int middle = (left + right) / 2;
			if (array[middle] == valueToSearch) {
				return true;
			}

			if (array[middle] < valueToSearch) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}

		return false;
	}

}
