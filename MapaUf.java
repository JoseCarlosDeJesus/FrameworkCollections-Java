package br.com.prog3.semana1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapaUf {

	public static void main(String[] args) {
		Map<String, String> ufs = new HashMap<String, String>();
		
		ufs.put("AC", "Acre");
		ufs.put("AP", "Amapá");
		ufs.put("AM", "Amazonas");
		ufs.put("BA", "Bahia");
		ufs.put("DF", "Distrito Federal");
		ufs.put("SC", "Santa Catarina");
		
		for(String chave : ufs.keySet()) {
			System.out.println(chave+"-"+ufs.get(chave));
		}
		System.out.println();
		ufs = new TreeMap<String, String>(ufs);
		
		for(String chave : ufs.keySet()) {
			System.out.println(chave+"-"+ufs.get(chave));
		}

	}

}
