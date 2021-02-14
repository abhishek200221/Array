package com.java.Array;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArray {
	public static void main(String[] args) {
		
		ArrayList<String> arraylist= new ArrayList<String>();
		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("C");
		arraylist.add("D");
		arraylist.add("E");
		System.out.println("Before Reverse ,ArrayList Contain :" +arraylist);
		
		Collections.reverse(arraylist);
		
		System.out.println("After Reverse ,ArrayList Contain :" +arraylist);
		
	}

}
