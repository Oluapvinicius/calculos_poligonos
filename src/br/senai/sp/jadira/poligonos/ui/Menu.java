package br.senai.sp.jadira.poligonos.ui;

import java.util.Scanner;

import br.senai.sp.jadira.poligonos.dao.CircuferenciaDao;
import br.senai.sp.jadira.poligonos.dao.QuadradoDao;
import br.senai.sp.jadira.poligonos.dao.RetanguloDao;
import br.senai.sp.jadira.poligonos.dao.TrapezioDao;
import br.senai.sp.jadira.poligonos.dao.TriânguloDao;

public class Menu {

    public static void criarMenu() {
        // Criando o scanner para entrada do usuário
        Scanner leitor = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("CALCULADORA DE POLÍGONOS");
        System.out.println("-------------------------");
        System.out.println("1 - QUADRADO");
        System.out.println("2 - RETÂNGULO");
        System.out.println("3 - TRIÂNGULO");
        System.out.println("4 - TRAPÉZIO");
        System.out.println("5 - CIRCUFERÊNCIA");
        System.out.println("6 - SAIR");
        System.out.println("-------------------------");
        System.out.print("Escolha uma opção (1-6): ");
        
        int opcao = leitor.nextInt();

        if (opcao == 1) {
            QuadradoDao.criar();
        } else if (opcao == 2) {
            RetanguloDao.criar();
        } else if (opcao == 3) {
            TriânguloDao.criar();
        } else if (opcao == 4) {
            TrapezioDao.criar();
        } else if (opcao == 5) {
            CircuferenciaDao.criar();
        } else if (opcao == 6) {
            System.out.println("Encerrando o programa. Bye!");
            System.exit(0);
        } else { 
            System.out.println("Opção inválida! Você deve escolher um número entre 1 e 6!");
        }

        // Perguntar ao usuário se ele deseja continuar com outra forma
        retornar();
    }

    public static void retornar() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Pressione o Enter para continuar...");
        leitor.nextLine();  // Espera o usuário pressionar Enter
        criarMenu();
    }

    public static void main(String[] args) {
        // Inicia o menu principal
        criarMenu();
    }
}
