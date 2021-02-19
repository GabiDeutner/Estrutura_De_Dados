package com.gabi.vetor.teste;
import com.gabi.vetor.Vetor;
public class Aula09 {
    public static void main (String[] args)throws Exception{
        Vetor vetor = new Vetor(3);
        
        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        
        System.out.println(vetor);
        
        vetor.remove(1);
        
        System.out.println(vetor);
    }
}
