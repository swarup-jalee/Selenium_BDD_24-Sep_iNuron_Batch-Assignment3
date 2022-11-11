package assignment_set3;

import java.util.Arrays;
import java.util.List;

public class ListDisplayTrue {

	public static void main(String[] args) {
		List<String> list1 =  Arrays.asList("Web Automation","API Automation","Mobile Automation");
		for(String result:list1)
		{
			if (result.contains("Mobile"))
				System.out.println("True");
			
		}
		
	}

}
