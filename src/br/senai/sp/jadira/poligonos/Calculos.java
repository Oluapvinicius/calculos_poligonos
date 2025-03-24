package br.senai.sp.jadira.poligonos;

import java.util.Scanner;

import br.senai.sp.jadira.poligonos.model.Circuferência;
import br.senai.sp.jadira.poligonos.model.Quadrado;
import br.senai.sp.jadira.poligonos.model.Retângulo;
import br.senai.sp.jadira.poligonos.model.Trapézio;
import br.senai.sp.jadira.poligonos.model.Triangulo;
import br.senai.sp.jadira.poligonos.ui.Menu;

public class Calculos {

    public static void main(String[] args) {
    	
    	//Menu.criarMenu();
    	
    	int contador = 0;
    	while(contador < 100) {
    		System.out.println("Tabuada - " + contador);
    		contador = contador + 1;
    		System.out.println("");
    	}
    	String resposta = "s";
    	while(resposta.equals("s")) {
    		System.out.println("Estamos dando voltas");
    		System.out.println("Gostaria de dar uma volta (s/n)?");
    		Scanner leitor = new Scanner(System.in);
    		resposta = leitor.next();
    		
    		
    	}
    	System.out.println("----------Tabuada do 9------------");
    	
    	contador = 1;
    	while(contador <= 10) {
    	System.out.println("Tabuada - " + contador);
		int resultado = 9 * contador;
		System.out.println("9 x" + contador + " = " + resultado );
		contador++;
    	}
    }
}
    	


