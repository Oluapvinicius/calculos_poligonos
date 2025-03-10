package br.senai.sp.jadira.poligonos.model;

public class Triangulo {
	
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
	    	System.out.println("DADOS DO TRIÂNGULO");
	        System.out.println("Base do triângulo: " + base);
	        System.out.println("Altura do triângulo: " + altura);
	        System.out.println("Área do triângulo: " + calcularArea());
	        System.out.println("------------------------------------");
	        
	    }
	}

