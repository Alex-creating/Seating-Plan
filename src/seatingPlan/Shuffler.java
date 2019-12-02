package seatingPlan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.*;
import java.lang.reflect.Array;

public class Shuffler {

	public void Shuffling(List entry) {
		
	
		Collections.shuffle(entry);
		
		List<String> row1 = entry.subList(0, 6);
		List<String> row2 = entry.subList(6, 12);
		List<String> row3 = entry.subList(12, 18);
		List<String> row4 = entry.subList(18, 23);
	
		
		System.out.println("                               Front");
		System.out.println("Row1 From the Left "+row1);
		System.out.println();
		System.out.println("Row2 From the Left "+row2);
		System.out.println();
		System.out.println("Row3 From the Left "+row3);
		System.out.println();
		System.out.println("Row4 From the Left "+row4);
		System.out.println("                                Back");
	}
}