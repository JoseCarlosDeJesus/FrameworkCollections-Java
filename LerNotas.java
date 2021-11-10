package br.com.prog3.aula1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LerNotas {

	public static void main(String[] args) {
		ArrayList notas = new ArrayList();
		double nota = 0.0;		
		do {
			nota = lerNota();
			if(nota >= 0) {
				notas.add(nota);
			}
			
		}while(nota > 0);
		if(notas.size() > 0) {	
			double soma = 0.0;
			for(int i = 0; i < notas.size();i++) {
				System.out.println(notas.get(i));
				soma += (Double)notas.get(i);
			}
			System.out.println(soma/notas.size());
		}

	}
	
	public static Double lerNota() {
		String nota = JOptionPane.showInputDialog("Digite a nota "
				+ "(\"-1\" para encerrar)");
		return Double.parseDouble(nota);
	}

}
