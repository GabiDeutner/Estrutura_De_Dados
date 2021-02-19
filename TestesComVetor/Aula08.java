package com.gabi.vetor.teste;
import com.gabi.vetor.Vetor;
public class Aula08 {
    
    public static void main (String[] args)throws Exception{
        Vetor vetor = new Vetor(3);
        
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        
        System.out.println(vetor);
    }
    
}
