package br.com.pc3.semana1;

import java.util.LinkedList;

public class Lista2 {

	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<String>();
		
		lista.add("Maria");
		lista.add("João");
		lista.add("João");
		
		for(String s : lista) {
			System.out.println(s);
		}

	}

}
