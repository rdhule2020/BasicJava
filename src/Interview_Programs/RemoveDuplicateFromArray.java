package Interview_Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int ar[] = {12, 34, 54, 54, 12, 34, 67, 4, 54, 76, 4, 2};
		
		Set<Integer> set = new LinkedHashSet< >();
		
		for(int num : ar)
		{
			set.add(num);
		}
		System.out.println("Array after removing duplicates :" + set);
	}

}
 