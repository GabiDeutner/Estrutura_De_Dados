
package com.gabi.vetor;
import java.lang.reflect.Array;


public class Lista<T> { // T é tipo type coloca o tipo de dado que eu quero (operador diamante)
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    
     public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }
    
    public boolean adiciona (Object elemento) throws Exception {
        this.aumentaCapacidade();
        return false;
    }

    private void aumentaCapacidade() throws Exception{
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(this.tamanho == this.elementos.length){
        T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
                for (int i=0; i<this.elementos.length; i++){
                    elementosNovos[i] = this.elementos[i];
                }
                this.elementos = elementosNovos;
    }
    
    }



}


    


    
