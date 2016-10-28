package sorting.mergesort;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import sorting.mergesort.MergeSort;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MergeSortTest {

	@Test
	public void test1() {
		MergeSort bs = new MergeSort(new int[] {});
		bs.sort();
	}
	
	@Test
	public void test2() {
		MergeSort bs = new MergeSort(new int[] {1});
		bs.sort();
	}
	
	@Test
	public void test3() {
		MergeSort bs = new MergeSort(new int[] {1,2,3,4,5,6,7,8,9});
		bs.sort();
	}
	
	@Test
	public void test4() {
		MergeSort bs = new MergeSort(new int[] {9,8,7,6,5,4,3,2,1,-9});
		bs.sort();
	}

}
