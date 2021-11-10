package br.com.pc3.semana1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("Maria");
		set.add("Carla");
		set.add("Catarina");
		set.add("Bianca");
		for(String s : set) {
			System.out.println(s);
		}

	}

}
