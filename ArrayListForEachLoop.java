package assignment_set3;

import java.util.Arrays;
import java.util.List;

public class ArrayListForEachLoop {

	public static void main(String[] args) {
		
		List<Integer> list1 =  Arrays.asList(1500,2000,800,385,321,3089,221);
		//for each loop to print values in ArrayList
		for(int num:list1)
		{
			System.out.println(num);
		}
	}

}
