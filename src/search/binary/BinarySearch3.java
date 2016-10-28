package search.binary;

public class BinarySearch3 {

	private int array[];
	
	public BinarySearch3(int array[]) {
		this.array = array;
	}
	
	public int search(int key) {
		return search(key, 0, array.length);
	}

	private int search(int key, int low, int high) {
		while (high >= low) {
			int middle = (low + high) / 2;
			if (array[middle] == key) {
				return middle;
			}
			if (array[middle] < key) {
				low = middle + 1;
			}
			if (array[middle] > key) {
				high = middle - 1;
			}
		}
		return -1;
	}

}
