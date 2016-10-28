package sorting.bubblesort;

public class BubbleSort7 {

	private int array[];
	
	public BubbleSort7(int array[]) {
		this.array = array;
	}

	public int[] sort() {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

}
