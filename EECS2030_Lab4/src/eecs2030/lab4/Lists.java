package eecs2030.lab4;

import java.util.Comparator;
import java.util.List;

public class Lists {
	private Lists(){} //no objects of this class are desired
	
	public static <T extends Comparable <? super T>> void defaultSort(List <T> list){
		list.sort(Comparator.naturalOrder()); //will use a built-in variation of mergesort
											//alternative: Collections.sort(list);
	}

	public static <T extends Comparable <? super T>> void selectionSortRecursive(List <T> list){
		//TODO implement the recursive solution
		int n = list.size() - 2;

		Lists.recursive(list, 0, n);
		
	}
	//other type beside integer
	public static <T extends Comparable <? super T>> void selectionSortIterative(List <T> list){
		//TODO implement the Iterative solution
		 
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				int a = (int) list.get(j);
				int b = (int) list.get(j + 1);
				if (a > b) {
					T temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
	}

	public static <T extends Comparable<? super T>> void recursive(List<T> list, int left, int right) {
		int a = (int) list.get(left);
		int b = (int) list.get(left + 1);
		T temp = list.get(left);

		if (right > 0) {
			if (a > b) {
				list.set(left, list.get(left + 1));
				list.set(left + 1, temp);
			}
			if (left < right) {

				Lists.recursive(list, left + 1, right);
			} else {
				Lists.recursive(list, 0, right - 1);

			}

		}

	}

}
