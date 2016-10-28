package search.binary;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import search.binary.BinarySearch;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinarySearchTest {

	@Test
	public void test1() {
		BinarySearch bs = new BinarySearch(new int[] {1});
		int result = bs.search(0);
		assertEquals(-1, result);
	}
	
	@Test
	public void test2() {
		BinarySearch bs = new BinarySearch(new int[] {1});
		int result = bs.search(1);
		assertEquals(0, result);
	}
	
	@Test
	public void test3() {
		BinarySearch bs = new BinarySearch(new int[] {1,2});
		int result = bs.search(1);
		assertEquals(0, result);
	}
	
	@Test
	public void test4() {
		BinarySearch bs = new BinarySearch(new int[] {1,2,3,4,5,6,7,8,9});
		int result = bs.search(9);
		assertEquals(8, result);
	}
	
}
