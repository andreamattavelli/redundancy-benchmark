package sorting.mergesort;

public class MergeSort4 {
	
	public int[] array;

	public MergeSort4(int[] array) {
		this.array = array;
	}

	public int[] sort() {
		sort(0, array.length - 1);
		return array;
	}

	private void sort(int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			sort(low, mid);
			sort(mid + 1, high);
			merge(low, mid, high);
		}
	}

	private void merge(int low, int mid, int high) {
		int[] helper = new int[array.length];
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high) {
			if (array[i] <= array[j]) {
				helper[k] = array[i];
				i++;
			} else {
				helper[k] = array[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			helper[k] = array[i];
			i++;
			k++;
		}
		while (j <= high) {
			helper[k] = array[j];
			j++;
			k++;
		}
		for (k = low; k <= high; k++) {
			array[k] = helper[k];
		}
	}
}
