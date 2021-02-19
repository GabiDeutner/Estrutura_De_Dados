
package com.gabi.vetor.teste;
import com.gabi.vetor.Vetor;

public class Aula04 {
    public static void main(String[] args)throws Exception{
        
        Vetor vetor = new Vetor(10);
        
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString()); // para ver o vetor concatenado
    }
  
}
