package test;

import java.util.ArrayList;
import java.util.Collections;

public class git {

	public static void main(String[] args) {
		log("Success");
		change(2);
	}
	
	public static void log (String text) {
		System.out.println(text);
	}
	
	public static void change (int num) {
		int n = num;
		if (n==2) {
			ArrayList<String> arr = new ArrayList<>();
			arr.add("Timati");
			arr.add("Scriptonite");
			arr.add("Almata");
			Collections.sort(arr);
			System.out.println("Names: " + arr);
			
		}
	}

}
