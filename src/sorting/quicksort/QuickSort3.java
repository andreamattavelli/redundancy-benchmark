package sorting.quicksort;

public class QuickSort3 {
	
	private int array[];
	
	public QuickSort3(int array[]) {
		this.array = array;
	}
	
	public int[] sort() {
		sort(0, array.length - 1);
		return array;
	}

	private void sort(int lowerIndex, int higherIndex) {
		if (lowerIndex >= higherIndex) {
			return;
		}
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
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
		if (lowerIndex < j)
			sort(lowerIndex, j);
		if (i < higherIndex)
			sort(i, higherIndex);
	}
	
}
