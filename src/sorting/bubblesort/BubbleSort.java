package sorting.bubblesort;

public class BubbleSort {

	private int array[];
	
	public BubbleSort(int array[]) {
		this.array = array;
	}

	public int[] sort() {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

}
