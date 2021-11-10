package br.com.pc3.semana1;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "Ana Maria");
		map.put("B", "Ana Maria");
		map.put("C", "Ana Maria");
		map.put("D", "Ana Maria");
		
		for(String s : map.values()) {
			System.out.println(s);
		}

	}

}
