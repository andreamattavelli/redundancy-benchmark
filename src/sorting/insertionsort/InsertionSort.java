package sorting.insertionsort;

public class InsertionSort {

	private int array[];
	
	public InsertionSort(int array[]) {
		this.array = array;
	}

	public int[] sort() {
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			int j = i - 1;
			while (j >= 0) {
				if (array[j] <= value) {
					break;
				}
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = value;
		}
		return array;
	}

}
