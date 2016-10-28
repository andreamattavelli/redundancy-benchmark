package sorting.mergesort;

public class MergeSort2 {

	private int array[];

	public MergeSort2(int array[]) {
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
		int helper[] = new int[array.length];
		int h = low, i = low, j = mid + 1, k;
		while ((h <= mid) && (j <= high)) {
			if (array[h] <= array[j]) {
				helper[i] = array[h];
				h++;
			} else {
				helper[i] = array[j];
				j++;
			}
			i++;
		}
		if (h > mid) {
			for (k = j; k <= high; k++) {
				helper[i] = array[k];
				i++;
			}
		}
		else {
			for (k = h; k <= mid; k++) {
				helper[i] = array[k];
				i++;
			}
		}
		for (k = low; k <= high; k++) {
			array[k] = helper[k];
		}
	}

}
