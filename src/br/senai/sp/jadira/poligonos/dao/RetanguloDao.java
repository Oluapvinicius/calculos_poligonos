package br.senai.sp.jadira.poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jadira.poligonos.model.Retângulo;
import br.senai.sp.jadira.poligonos.ui.Menu;

public class RetanguloDao {
	
	public static void criar() {
		
        Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um Retângulo...");
		
		Retângulo retangulo = new Retângulo ();
		
		System.out.print("Digite  a medida do lado do Retângulo:");
		
		retangulo.setLado(leitor.nextDouble());
		retangulo.exibirDados();
		
		Menu.retornar();
		
		leitor.close();
		
	}

}
