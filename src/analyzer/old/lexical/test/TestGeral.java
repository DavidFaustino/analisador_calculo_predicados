package analyzer.old.lexical.test;

import java.util.ArrayList;
import java.util.List;

public class TestGeral {
	
	public static void main(String[] args) {
		List<String> iden =  new ArrayList<String>();
		
		String tape = "David Faustino";
		
		
		for (int i = 0; i < tape.length(); i++) {
			char c = tape.charAt(i);
			
			//System.out.print(c + " = ");
			
			if(reconhece_minusc(c)) iden.add("minusc");
			if(reconhece_maiusc(c)) iden.add("maiusc");
			if(reconhece_digito(c)) iden.add("digito");
			
			//System.out.println("\n");
			
			
		}
		
		iden.forEach(n -> {
			System.out.println(n);
		});
		
		
	}
	
	public static boolean reconhece_numero(char c){
		
		return false;
	}
	
	public static boolean reconhece_digito(char c){
		Character [] n = {'0','1','2','3','4','5','6','7','8','9'};
		for (int i = 0; i < n.length; i++) {
			if(n[i].equals(c)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean reconhece_minusc(char c){
		if(reconhece_ao(c) || reconhece_pz(c)){
			//System.out.print("minusc");
			return true;
		}
		return false;
	}

	public static boolean reconhece_ao(char c){
		Character [] n = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'};
		for (int i = 0; i < n.length; i++) {
			if(n[i].equals(c)){
				//System.out.println("ao");
				return true;
			}
			
		}
		return false;
	}
	
	public static boolean reconhece_pz(char c){
		Character [] n = {'p','q','r','s','t','u','v','x','w','y','z'};
		for (int i = 0; i < n.length; i++) {
			if(n[i].equals(c)){
				//System.out.println("pz");
				return true;
			}
			
		}
		return false;
	}
	
	public static boolean reconhece_maiusc(char c){
		if(reconhece_AO(c) || reconhece_PZ(c)){
			//System.out.print("maiusc");
			return true;
		}
		return false;
	}

	public static boolean reconhece_AO(char c){
		Character [] n = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
		for (int i = 0; i < n.length; i++) {
			if(n[i].equals(c)){				
				return true;
			}
			
		}
		return false;
	}
	
	public static boolean reconhece_PZ(char c){
		Character [] n = {'P','Q','R','S','T','U','V','X','W','Y','Z'};
		for (int i = 0; i < n.length; i++) {
			if(n[i].equals(c)){
				return true;
			}
			
		}
		return false;
	}
}
