package eecs2030.lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sortExperiment {
	private static Random rng = new Random();

	public static void main(String[] args) {
		List <Integer> list;
		long start, end, start1, end1, start2, end2;

		//You might need to change the 1M value to something smaller for other sorts
		for (int i = 10; i <= 100; i *= 2){ 
			list = createRandomList(i); 
			start = System.nanoTime();
			Lists.defaultSort(list);
			end = System.nanoTime();
			
			start1 = System.nanoTime();
			Lists.selectionSortIterative(list);
			end1 = System.nanoTime();

			start2 = System.nanoTime();
			Lists.selectionSortRecursive(list);;
			end2 = System.nanoTime();
			
			System.out.println("N=" + i + " \nDefault Sort, " + "Time spent: " + (end - start)/1e6 + " ms");
			System.out.println( "Selection-Iterative, " + "Time spent: " + (end1 - start1)/1e6 + " ms");	
			System.out.println( "Selection-Recursive, " + "Time spent: " + (end2 - start2)/1e6 + " ms");

		}

	}

	private static List <Integer> createRandomList (int size){
		rng.setSeed(8);
		List <Integer> list = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			list.add(rng.nextInt());
		}
		return list;
	}


}
