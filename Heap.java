import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Heap {
	private static void build_max_heap(int[] a){
		int len = a.length;
		// run max_heapify function starting from index len/2 down to 0
		for(int i = len/2; i >= 0; i--){
			max_heapify(a, i, len);
		}
	}

	private static void max_heapify(int[] a, int index, int len){
		// max_heapify function moves the given index element to its correct
		// location in the subtree rooted at 'index'
		int i = index;
		int l = left(index);
		int r = right(index);
		if(l >= len || r >= len) return;
		if(a[l] < a[r])	i = r;
		else i = l;
		if(a[index] < a[i]){
			exch(a, index, i);
			max_heapify(a, i, len);
		}
	}

	private static int right(int index){
		// returns the right side child location of the given index
		return 2*(index + 1);
	}

	private static int left(int index){
		// returns the left side child location of the given index
		return 2*(index + 1) - 1;
	}

	private static void exch(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void sort(int[] a){
		// first build the max heap
		build_max_heap(a);
		int len = a.length;
		while(len > 0){
			// root is always the biggest element.
			// exchange the root with last element and call max_heapify function
			// decrement 'len' iterate until all elements are sorted
			// In this sort after each step, we have the greatest element until then
			exch(a, 0, --len);
			max_heapify(a, 0, len);
		}
	}

	public static boolean isSorted(int[] a){
		for(int i = 0; i < a.length - 1; i++){
			if(a[i] > a[i + 1]) return false;
		}
		return true;
	}

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File("./dataset.txt"));
		int[] a = new int[scanner.nextInt()];
		for(int i = 0; i < a.length; i++){
			a[i] = scanner.nextInt();
		}
		Heap.sort(a);
		if(Heap.isSorted(a)) System.out.println("Array is sorted");
		else System.out.println("Array is not sorted");
	}
}