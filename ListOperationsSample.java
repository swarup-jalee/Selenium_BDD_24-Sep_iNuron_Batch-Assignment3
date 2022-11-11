package assignment_set3;

import java.util.ArrayList;

public class ListOperationsSample {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(33);
		list1.add(44);
		list1.add(55);
		list1.add(66);
		list1.add(77);
		list1.add(88);
		System.out.println("List of Initial Items in ArrayList are "+list1);
		list1.remove(1);//removing value by Index
		System.out.println("After Removing 2nd Element using Index "+list1);
		list1.remove(Integer.valueOf(55));//removing value by Value
		System.out.println("After Removing 2nd Element using Value "+list1);
		list1.add(3, 90);//adding Item to ArrayList at Index 3 of value 90
		System.out.println("After Adding 90 at index 3 "+list1);
		//Determine the size of ArrayList
		System.out.println("Now the length of the ArrayList is "+list1.size());
		//print all values from the list
		for(int num:list1)
		{
			System.out.println(num);
		}
		//convert List to Array
		Integer[]arr = new Integer [list1.size()];
		list1.toArray(arr);
		 System.out.print("Elements of Array from List: ");
		 
		 for (int i=0 ;i<arr.length;i++)
		 {
	            System.out.print(arr[i] + "  ");
	       }

	}

}
