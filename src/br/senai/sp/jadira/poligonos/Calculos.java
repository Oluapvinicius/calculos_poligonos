package br.senai.sp.jadira.poligonos;


import br.senai.sp.jadira.poligonos.model.Circuferência;
import br.senai.sp.jadira.poligonos.model.Quadrado;
import br.senai.sp.jadira.poligonos.model.Retângulo;
import br.senai.sp.jadira.poligonos.model.Trapézio;
import br.senai.sp.jadira.poligonos.model.Triangulo;

public class Calculos {

    public static void main(String[] args) {

       
        Quadrado quadrado1 = new Quadrado();
        quadrado1.setLado(1);
        quadrado1.exibirDados();  

    
        Retângulo r1 = new Retângulo();
        r1.setLado(5);  
        r1.exibirDados(); 
        
        
        Triangulo triangulo1 = new Triangulo();
        triangulo1.setBase(5);  
        triangulo1.setAltura(10); 
        triangulo1.exibirDados();
        
        Trapézio ta = new Trapézio();
        ta.setBase(2);  
        ta.setAltura(11); 
        ta.exibirDados();
        
         
            Circuferência circ = new Circuferência(0);
            circ.exibirDados();
        
        
    }
}


