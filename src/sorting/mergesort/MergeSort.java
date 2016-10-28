package sorting.mergesort;

public class MergeSort {

	private int[] array;

	public MergeSort(int[] array) {
		this.array = array;
	}

	public int[] sort() {
		sort(0, array.length - 1);
		return array;
	}

	private void sort(int low, int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;
			sort(low, middle);
			sort(middle + 1, high);
			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {
		int[] helper = new int[array.length];
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				array[k] = helper[i];
				i++;
			} else {
				array[k] = helper[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = helper[i];
			k++;
			i++;
		}
	}

}
