package com.gabi.vetor.teste;

import com.gabi.vetor.Lista;
//import com.gabi.vetor.VetorObjetos;

public class Aula11 {
   
    public static void main(String[] args)throws Exception{
        Lista<Contato> vetor = new Lista<Contato>(1);
    
        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com"); 

        
        vetor.adiciona(vetor);
        
    }
    

    
    
}
