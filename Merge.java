import java.io.*;
import java.util.*;

public class Merge {
	public static void sort(int[] a) {
		// create a auxiliary array same size as original array
		int[] aux = new int[a.length];
		sort(a, aux, 0, a.length - 1);
	}

	private static void sort(int[] a, int[] aux, int lo, int hi) {
		// lo and hi represent the start and end indices of the array respectively
		// return if the array has only one element	
		if(hi <= lo)	return;
		int mid = lo + (hi - lo) / 2;
		// sort the first half of the array
		sort(a, aux, lo, mid);
		// sort the next half of the array
		sort(a, aux, mid + 1, hi);
		// merge the two sorted halves
		merge(a, aux, lo, mid, hi);	
	}

	private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
		int i = lo, j = mid + 1;
		for(int k = lo; k <= hi; k++) {
			if (i > mid) aux[k] = a[j++];
			else if (j > hi) aux[k] = a[i++];
			else if (a[i] < a[j]) aux[k] = a[i++];
			else aux[k] = a[j++];
		}
		for(int id = lo; id <= hi; id++) {
			a[id] = aux[id];
		}
	}

	public static boolean isSorted(int[] a) {
		// check if the array is sorted
		for(int id = 0; id < a.length - 1; id++) {
			if(a[id] > a[id + 1])	return false;
		}
		return true;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("./dataset.txt"));
		int[] a = new int[s.nextInt()];
		for(int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		s.close();
		System.out.println("Size of the array is: " + a.length);
		Merge.sort(a);
		if(Merge.isSorted(a))	System.out.println("Array is sorted");
		else	System.out.println("Array is not sorted");
	}
}
