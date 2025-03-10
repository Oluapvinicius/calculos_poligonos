package br.senai.sp.jadira.poligonos.model;

public class Circuferência{  

    private double raio;  
    private final double PI = Math.PI;  

    
    public Circufêrencia(double raio) {
        this.raio = raio;
    }

    
    public double calcularArea() {
        return PI * Math.pow(raio, 2);
    }

   
    public double calcularRaio(double area) {
        return Math.sqrt(area / PI);
    }

    
    public void exibirDados() {
        System.out.println("Raio da circunferência: " + raio);
        System.out.println("Área da circunferência: " + calcularArea());
        
        
        double area = 78.54;
        double raioCalculado = calcularRaio(area);
        
        System.out.println("Raio calculado a partir da área de " + area + ": " + raioCalculado);
    }
}