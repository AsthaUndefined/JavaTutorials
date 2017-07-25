package com.SearchingAlgo;

class BinarySearch {
	int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}

	int binarySearchIterate(int arr[], int x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			if (arr[m] == x)
				return m;

			if (arr[m] < x)
				l = m + 1;

			else
				r = m - 1;
		}

		return -1;
	}

	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40,50,60,70};
		int n = arr.length;
		int x = 40;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);

		int result2 = ob.binarySearchIterate(arr, x);
		if (result2 == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result2);
	}
}
