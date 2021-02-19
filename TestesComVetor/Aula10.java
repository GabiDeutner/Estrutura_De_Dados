
package com.gabi.vetor.teste;
import com.gabi.vetor.VetorObjetos;

public class Aula10 {
    
    public static void main(String[] args)throws Exception{
        VetorObjetos vetor = new VetorObjetos(3);
        
        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");       
        Contato c4 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        
        vetor.adiciona(c1); // posição 0
        vetor.adiciona(c2); // posição 1
        vetor.adiciona(c3); // posição 2
    
        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);
                
    }
    
    
}
