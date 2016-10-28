package search.binary;

public class BinarySearch4 {

	private int array[];
	
	public BinarySearch4(int array[]) {
		this.array = array;
	}
	
	public int search(int key) {
		return search(key, 0, array.length);
	}
	
	private int search(int key, int lo, int hi) {
		int middle = (lo + hi) / 2;
		while (lo <= hi) {
			if (array[middle] < key)
				lo = middle + 1;
			else if (array[middle] == key) {
				return middle;
			} else
				hi = middle - 1;

			middle = (lo + hi) / 2;
		}
		return -1;
	}

}
