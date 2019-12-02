package seatingPlan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class main {
	public static void main(String[] args) {
		ArrayList<String> people1 = new ArrayList<>();
		people1.add("Adam M");
		people1.add("Alex R");
		people1.add("Alwin T");
		people1.add("Anthony W");
		people1.add("Chloe A");
		people1.add("Chris J");
		people1.add("Euan R");
		people1.add("Ewan D");
		people1.add("Harris H");
		people1.add("James B");
		people1.add("James K");
		people1.add("Jess L");
		people1.add("John G");
		people1.add("Liam M");
		people1.add("Lizzie C");
		people1.add("Luke P");
		people1.add("Luke C");
		people1.add("Luke H");
		people1.add("Matt F");
		people1.add("Neevan V");
		people1.add("Rebekah R");
		people1.add("Tigs K");
		people1.add("Zohaib Z");
		people1.add("Empty");
		Collections.shuffle(people1);
		List<String> row1 = people1.subList(0, 6);
		List<String> row2 = people1.subList(6, 12);
		List<String> row3 = people1.subList(12, 18);
		List<String> row4 = people1.subList(18, 24);
		//System.out.println(people1);
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