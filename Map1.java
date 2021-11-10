package br.com.pc3.semana1;

import java.util.Hashtable;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		 Apartamento a1 = new Apartamento(); 
		  Apartamento a2 = new Apartamento();
		  Apartamento a3 = new Apartamento();
		  
		  a1.setCodigo(1); 
		  a1.setArea(150.0); 
		  a1.setNumeroComodo(4); 
		  a2.setCodigo(2);
		  a2.setArea(120.0); 
		  a2.setNumeroComodo(4); 
		  a3.setCodigo(1); 
		  a3.setArea(50.0);
		  a3.setNumeroComodo(3);
		  
		  Map<Integer, Apartamento> map = new Hashtable<>();
		  map.put(a1.getCodigo(), a1);
		  map.put(a2.getCodigo(), a2);
		  map.put(a3.getCodigo(), a3);
		  
		  for(Integer cod : map.keySet()) {
			  System.out.println(map.get(cod));
		  }
		  System.out.println();
		  for(Apartamento a : map.values()) {
			  System.out.println(a);
		  }

	}

}
