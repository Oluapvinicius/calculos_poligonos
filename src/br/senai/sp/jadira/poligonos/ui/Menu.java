package br.senai.sp.jadira.poligonos.ui;

import java.util.Scanner;

import br.senai.sp.jadira.poligonos.dao.QuadradoDao;
import br.senai.sp.jadira.poligonos.dao.RetanguloDao;
import br.senai.sp.jadira.poligonos.dao.TriânguloDao;

public class Menu {
	public static void criarMenu() {
		
	Scanner leitor = new Scanner(System.in);
	
	
		System.out.println("-------------------------");
		System.out.println("CALCULADORA DE POLIGONOS");
		System.out.println("-------------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETÃNGULO");
		System.out.println("3 - TRIÂNGULO");
		System.out.println("4 - TRAPÉZIO");
		System.out.println("5 - CIRCUFERÊNCIA");
		System.out.println("-------------------------");
		System.out.print("Escolha uma opção (1-5): ");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criar();
		} else if (opcao == 2) {
			RetanguloDao.criar();
			// chamar o RetanguloDao
		} else if (opcao == 3) {
			TriânguloDao.criar();
			// chamar o triangulo dao
		} else if (opcao == 4) {
			// chamar o trapezio dao
		} else if (opcao == 5) {
			// chamar circuferenciadao
		} else { 
			System.out.println("Opção inválida! Você deve escolher um número entre 1 e 5!");
		}
	    }

}
