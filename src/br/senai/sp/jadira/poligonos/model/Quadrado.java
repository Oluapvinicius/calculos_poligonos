package br.senai.sp.jadira.poligonos.model;

import br.senai.sp.jadira.poligonos.model.Quadrado;

public class Quadrado {
	
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	public double calculaPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("------------------------------------");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("Tamanho do lado: " + lado);
		System.out.println("Área total: " + calcularArea());
		System.out.println("Perímetro: " + calculaPerimetro());
		System.out.println("------------------------------------");
		
	}
}
