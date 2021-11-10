package br.com.prog3.aula1;

import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Condominio {

	public static void main(String[] args) {
		/*
		 * Apartamento a1 = new Apartamento(); Apartamento a2 = new Apartamento();
		 * Apartamento a3 = new Apartamento();
		 * 
		 * a1.setCodigo(1); a1.setArea(150.0); a1.setNumeroComodo(4); a2.setCodigo(2);
		 * a2.setArea(120.0); a2.setNumeroComodo(4); a3.setCodigo(1); a3.setArea(50.0);
		 * a3.setNumeroComodo(3);
		 */
		
		Set<Apartamento> aps = new HashSet<>();
		/*
		 * aps.add(a1); aps.add(a2); aps.add(a3); for(Apartamento a : aps) {
		 * System.out.println(a); }
		 */
		long inicio = Calendar.getInstance().getTimeInMillis();
		for(int i = 1; i <= 10000; i++) {
			Apartamento a = new Apartamento();
			a.setCodigo(i);
			a.setArea(Math.random()*1000);
			a.setNumeroComodo(Math.ceil((Math.random()*20)));
			
			aps.add(a);
		}
		long fim = Calendar.getInstance().getTimeInMillis();
		System.out.println("Tempo gasto: "+(fim-inicio)+"ms");
		
		Apartamento ap = new Apartamento();
		ap.setCodigo(5000);
		
		//System.out.println(Collections.binarySearch(aps,5000));
		

	}

}
