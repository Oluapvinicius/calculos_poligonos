package br.senai.sp.jadira.poligonos.dao;

import java.util.Scanner;


import br.senai.sp.jadira.poligonos.model.Circuferência;
import br.senai.sp.jadira.poligonos.ui.Menu;


public class CircuferenciaDao {
    public static void criar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Criando uma Circunferência...");

        Circuferência circ = new Circuferência(0);

        System.out.print("Digite a medida do raio da Circunferência: ");
        double medidaRaio = leitor.nextDouble();
        
        circ.calcularRaio(medidaRaio);
        circ.calcularArea(); 
        circ.exibirDados();
        
        Menu.retornar();
    	
    	leitor.close();
    	
    }
}
