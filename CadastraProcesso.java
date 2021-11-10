package br.com.prog3.aula1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CadastraProcesso {

	public static void main(String[] args) {
		int numero = 0;
		List<Processo> processos = new ArrayList<>();

		do {
			String sNumero = JOptionPane.showInputDialog("Digite o número");
			numero = Integer.parseInt(sNumero);
			if (numero > 0) {
				String classe = JOptionPane.showInputDialog("Digite a classe");
				String assunto = JOptionPane.showInputDialog("Digite o assunto");

				Processo p = new Processo();
				p.setNumero(numero);
				p.setClasse(classe);
				p.setAssunto(assunto);
				processos.add(p);
			}

		} while (numero > 0);
		
		if(!processos.isEmpty()) {
			for(Processo p : processos) {
				//JOptionPane.showMessageDialog(null, p);
				System.out.println(p);
			}
		}

	}

}
