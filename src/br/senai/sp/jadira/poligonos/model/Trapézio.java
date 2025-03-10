package br.senai.sp.jadira.poligonos.model;

public class Trapézio {
	

	private double base;
    private double altura;

    
    public void setBase(double base) {
        this.base = base;
    }

  
    public void setAltura(double altura) {
        this.altura = altura;
    }

  
    public double calcularArea() {
        return (base * altura) / 2;
    }

  
    public void exibirDados() {
    	System.out.println("------------------------------------");
    	System.out.println("DADOS DO TRAPÉZIO");
        System.out.println("Base do  trapezio: " + base);
        System.out.println("Altura do trapezio: " + altura);
        System.out.println("Área do trapezio: " + calcularArea());
        System.out.println("------------------------------------");
        
    

   }
}
