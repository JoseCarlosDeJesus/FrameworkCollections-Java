package br.com.pc3.semana1;

import java.util.ArrayList;

public class Lista1 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("String 1");
		lista.add("String 2");
		
		for(String s : lista) {
			System.out.println(s);
		}
		
	}

}
