package search.binary;

public class BinarySearch {

	private int array[];
	
	public BinarySearch(int array[]) {
		this.array = array;
	}
	
	public int search(int key) {
		return search(key, 0, array.length);
	}

	private int search(int key, int lo, int hi) {
		if (hi <= lo) {
			return -1;
		}
		int mid = lo + (hi - lo) / 2;
		if ( array[mid] > key) {
			return search(key, lo, mid);
		}
		else if (array[mid] < key) {
			return search(key, mid + 1, hi);
		}
		else {
			return mid;
		}
	}

}