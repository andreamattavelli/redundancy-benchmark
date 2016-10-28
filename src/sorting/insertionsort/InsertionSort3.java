package sorting.insertionsort;

public class InsertionSort3 {

private int array[];
	
	public InsertionSort3(int array[]) {
		this.array = array;
	}

	public int[] sort() {
		for (int i = 1; i < array.length; i++) {
			int value = array[i];
			int j = i;
			while ((j > 0) && (array[j - 1] > value)) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = value;
		}
		return array;
	}
	
}
