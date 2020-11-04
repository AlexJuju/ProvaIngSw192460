package ingsw20_11_04;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	public static MyListUtil mylist;
	public static ArrayList <Integer> list;
	
	@BeforeClass
	public static void init () {
		mylist = new MyListUtil();
		list = new ArrayList<Integer> (Arrays.asList(5,3,6,9,2,5,8));
	}
	
	@Test
	public void TestOrdAscendente () {
		assertEquals( Arrays.asList(2,3,5,5,6,8,9), mylist.sortUp( list ) );
	}
	
	@Test
	public void TestOrdDiscendente () {
		assertEquals( Arrays.asList(9,8,6,5,5,3,2), mylist.sortDown( list ) );
	}
}
