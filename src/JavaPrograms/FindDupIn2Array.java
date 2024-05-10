package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDupIn2Array {
	public static void main(String[] args) {
		int arr1[]= {45,76,23,46,88,99,56,23,12,30,46,78,90};
		int arr2[]= {65,67,31,93,66,77,23,90,90,45,91,38,50};
		
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++) {
			if(set.contains(arr2[j])) {
				System.out.println(arr2[j]);
			}
		}
	}

}
