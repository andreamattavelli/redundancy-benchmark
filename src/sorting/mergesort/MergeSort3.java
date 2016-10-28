package sorting.mergesort;

public class MergeSort3 {

	public int array[];

	public MergeSort3(int array[]) {
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
			merge(low, mid + 1, high);
		}
	}

	private void merge(int low, int mid, int high) {
		int[] helper = new int[array.length];
		int endLeft = mid - 1;
		int k = low;
		int numElemen = high - low + 1;
		while (low <= endLeft && mid <= high) {
			if ((array[low]) < (array[mid])) {
				helper[k++] = array[low++];
			} else {
				helper[k++] = array[mid++];
			}
		}
		while (low <= endLeft) {
			helper[k++] = array[low++];
		}
		while (mid <= high) {
			helper[k++] = array[mid++];
		}
		for (int i = 0; i < numElemen; i++, high--) {
			array[high] = helper[high];
		}
	}

}
