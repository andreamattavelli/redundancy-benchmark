package sorting.quicksort;

public class QuickSort2 {

private int array[];
	
	public QuickSort2(int array[]) {
		this.array = array;
	}
	
	public int[] sort() {
		sort(0, array.length - 1);
		return array;
	}

	private void sort(int low, int high) {
		if (high <= low || low >= high) {
			return;
		} else {
			int pivot = array[low];
			int i = low + 1;
			int tmp;
			for (int j = low + 1; j <= high; j++) {
				if (pivot > array[j]) {
					tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
					i++;
				}
			}
			array[low] = array[i - 1];
			array[i - 1] = pivot;
			sort(low, i - 2);
			sort(i, high);
		}
	}

}
