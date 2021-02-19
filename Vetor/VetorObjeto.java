package com.gabi.vetor;

public class VetorObjetos {
    private Object[] elementos;
    private int tamanho;
    
    public VetorObjetos(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

public boolean adiciona(Object elemento)throws Exception{
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        return true;
    }
    return false;
} 


public boolean adiciona (int posicao, Object elemento)throws Exception{
    if(!(posicao >= 0 && posicao < tamanho)){
        throw new IllegalArgumentException("Posição Inválida");
    }
    this.aumentaCapacidade();
    return true;  
}
 

private void aumentaCapacidade()throws Exception {
        if (this.tamanho == this.elementos.length){
        Object[] elementosNovos = new Object[this.elementos.length * 2];
        for (int i=0 ; i<this.elementos.length; i++){
            elementosNovos[i] = this.elementos[i];
        }
        this.elementos = elementosNovos;
}
}

public Object busca(int posicao)throws Exception{
    if (!(posicao >= 0 && posicao < tamanho)){
        throw new IllegalArgumentException("Posição inválida");
    }
    return this.elementos[posicao];
    }

public int busca(Object elemento)throws Exception{
    for (int i=0; i<this.tamanho; i++){
    if (this.elementos[i].equals(elemento)){
        return i;
    }
}
    return -1;
}

    public String tamanho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
    

