package br.senai.sp.jadira.poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jadira.poligonos.model.Trapézio;
import br.senai.sp.jadira.poligonos.ui.Menu;

public class TrapezioDao {
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando Trapèzio...");
		
		Trapézio tra = new Trapézio();
		
		System.out.print("Digite  a medida do lado do Trapézio:");
		
		tra.setAltura(leitor.nextDouble());
		tra.setBase(leitor.nextDouble());
		tra.exibirDados();
		
		Menu.retornar();
		
		leitor.close();
		
		
	}

}
