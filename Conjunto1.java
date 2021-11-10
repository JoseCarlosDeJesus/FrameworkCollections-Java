package br.com.pc3.semana1;

import java.util.HashSet;
import java.util.Set;

public class Conjunto1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("String 1");
		set.add("String 2");
		set.add("String 3");
		set.add("String 4");
		set.add("String 1");
		
		System.out.println(set.size());
		for(String s : set) {
			System.out.println(s);
		}

	}

}
