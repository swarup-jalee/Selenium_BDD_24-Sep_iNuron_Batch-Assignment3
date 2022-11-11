package assignment_set3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorLoop {

	public static void main(String[] args) {
		List<Integer> list1 =  Arrays.asList(150,200,80,385,321,309,221);
		Iterator<Integer> numIterator = list1.iterator();
		while(numIterator.hasNext())
		{
			System.out.println(numIterator.next());
		}

	}

}
