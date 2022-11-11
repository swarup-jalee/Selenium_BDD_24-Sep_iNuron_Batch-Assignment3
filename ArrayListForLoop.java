package assignment_set3;

import java.util.Arrays;
import java.util.List;

public class ArrayListForLoop {

	public static void main(String[] args) 
	{
		List<Integer> list1= Arrays.asList(1500,200,1700,2150,9875,10000);
		
		for (int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}

	}

}
