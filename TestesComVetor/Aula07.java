
package com.gabi.vetor.teste;
import com.gabi.vetor.Vetor;
public class Aula07 {
    public static void main (String[]args)throws Exception{
        Vetor vetor = new Vetor(10);
        
        vetor.adiciona("B"); // usa o primeiro método adiciona
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        
        System.out.println(vetor);
        
        vetor.adiciona(0,"A"); // dois parâmetros, um elemento, ele vai usar o segundo método adiciona
     
        System.out.println(vetor);
        
        vetor.adiciona(3,"D");   
        
        System.out.println(vetor);
    }
}
