package assignment_set3;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegerArrayList {

	public static void main(String[] args) {
		List<Integer> list1 =  Arrays.asList(10,20,30,40,50,60,70);
		int sum=0;
		for(int i=0;i<list1.size();i++)
		{
			sum=sum+list1.get(i);
		}
		System.out.println("Sum of the Numbers in List are " +sum);
	}
	
}
