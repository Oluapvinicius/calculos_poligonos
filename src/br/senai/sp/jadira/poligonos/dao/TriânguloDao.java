package br.senai.sp.jadira.poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jadira.poligonos.model.Triangulo;
import br.senai.sp.jadira.poligonos.ui.Menu;

public class TriânguloDao {
	
	public static void criar() {
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Criando um Triângulo...");
	
	Triangulo triangulo = new Triangulo();
	
	System.out.print("Digite  a medida do lado do Triângulo:");
	
	triangulo.setAltura(leitor.nextDouble());
	triangulo.setBase(leitor.nextDouble());
	triangulo.exibirDados();
	
	// Perguntar ao usuario se ele deseja criar outra forma
	System.out.print("Pressione o Enter para continuar...");
	
	
	
	Menu.retornar();
	
	leitor.close();
	
	
	}

}
