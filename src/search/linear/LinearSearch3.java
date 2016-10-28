package search.linear;

public class LinearSearch3 {

	private int array[];

	public LinearSearch3(int array[]) {
		this.array = array;
	}
	
	public int search(int key) {
		int index = 0;
		while(index < array.length) {
			if(array[index] == key) {
				return index;
			}
			if(array[index] < key) {
				return -1;
			}
			index++;
		}
		return -1;
	}
}
