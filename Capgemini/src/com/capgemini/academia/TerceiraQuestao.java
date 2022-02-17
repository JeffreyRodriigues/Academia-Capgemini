package com.capgemini.academia;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TerceiraQuestao {

	public static void main(String[] args) {
		/*
		 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
		 * podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
		 * algoritmo que encontre o número de pares de substrings que são anagramas.
		 */
		
		String palavra;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o texto : ");
        palavra = leia.nextLine();
		
        anagrama(palavra);
	}
	
	 static void anagrama( String palavra ){
	        
	        HashMap<String, Integer> mapa = new HashMap<>();

	        for(int i  = 0; i <= palavra.length(); i++){
	            
	       
	            for( int x = i; x < palavra.length(); x++ ){
	                
	                char[] caracter = palavra.substring(i, x+1).toCharArray();
	                Arrays.sort(caracter);
	                String subCaract = new String(caracter);

	                if(mapa.containsKey(subCaract)){
	                    mapa.put(subCaract, mapa.get(subCaract) + 1);
	                }                    
	                else{
	                    mapa.put(subCaract,1);
	                }                    
	            }
	        }

	        int Pares = 0;
	        
	        for(String cont: mapa.keySet()) {
	            
	            int n = mapa.get(cont);
	            Pares += (n*(n-1))/2;
	        }
	        System.out.print("O número de pares é " +Pares);
	    }

	}


