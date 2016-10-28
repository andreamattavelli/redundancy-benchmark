package sorting.quicksort;

public class QuickSort {

	private int array[];
	
	public QuickSort(int array[]) {
		this.array = array;
	}
	
	public int[] sort() {
		sort(0, array.length - 1);
		return array;
	}

	private void sort(int low, int high) {
		if (low >= high) {
			return;
		}
		int middle = low + (high - low) / 2;
		int pivot = array[middle];
		int i = low, j = high;
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j) {
			sort(low, j);
		}
		if (high > i) {
			sort(i, high);
		}
	}

}
