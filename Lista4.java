package br.com.pc3.semana1;

import java.util.Vector;

public class Lista4 {

	public static void main(String[] args) {
		Vector<String> vetor = new Vector<String>();
		vetor.add("Maria");
		vetor.add("João");
		vetor.add("João");
		
		for(String s : vetor) {
			System.out.println(s);
		}

	}

}
