package assignment_set3;

import java.util.ArrayList;
import java.util.List;

public class StoreArrayInList {

	public static void main(String[] args) {
		int arry[]= {10,20,30,40,50};
		//define a new List and initialize
		List<Integer> newList= new ArrayList<Integer>();
		for (int i=0;i<arry.length;i++)
		{
			
			//store each of the array element into list using add method
			newList.add(arry[i]);
		}
		
		System.out.println("Items added to the List are " +newList);

	}

}
