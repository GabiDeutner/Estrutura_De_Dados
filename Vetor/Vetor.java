package com.gabi.vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho;
    
    public Vetor(int capacidade){
       this.elementos = new String[capacidade];
       this.tamanho = 0;
    }
    
   //public void adiciona(String elemento) throws Exception{
    public boolean adiciona(String elemento) throws Exception{
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        return true;
       // } else {
      //      throw new Exception("Vetor ja esta cheio, não é possivel adicionar");
        }
        return false;
    } 
    
    
    public int tamanho(){
        return this.tamanho; // retorna tamanho do vetor
    }
    
    
      public String toString(){ // método padrão java
    StringBuilder s = new StringBuilder(); // StringBuilder é uma classe do java
    s.append("["); // append separa as strings
    for(int i=0;i<this.tamanho-1; i++){ // pega o tamanho inteiro do s e tira 1
        s.append(this.elementos[i]);
        s.append(",");
}
    if(this.tamanho>0){
        s.append(this.elementos[this.tamanho-1]);
    }      
    s.append("]");
    return s.toString();
}
      public boolean adiciona(int posicao,String elemento){
          if(!(posicao>=0 && posicao < tamanho)){ // é o que está dentro do parenteses ao contrário
              throw new IllegalArgumentException("posição invalida");
          }
          //mover todos os elementos
          for(int i=this.tamanho-1; i>=posicao; i--){
              this.elementos[i+1]=this.elementos[i];
          }
          this.elementos[posicao]=elemento;
          this.tamanho++;
          return false;
      }
      public String busca(int posicao){
          if(!(posicao >=0 && posicao < tamanho)){ // se estiver fora da posição do vetor é posição invalida
              throw new IllegalArgumentException("posição invalida");
          }
              return this.elementos[posicao];
      }
      public boolean busca(String elemento){ //método que busca string
          for (int i=0; i<this.tamanho; i++){
              if (this.elementos[i].equals(elemento)){
                  return true;
              }
          }
          return false;
      } // se usar o return i que não é booleano vc sabe onde o vetor está (posição)
      
      private void aumentaCapacidade(){
          if (this.tamanho == this.elementos.length){
              String[] elementosNovos = new String[this.elementos.length * 2];
              for (int i=0; i<this.elementos.length; i++){
                  elementosNovos[i] = this.elementos[i];
              }
              this.elementos = elementosNovos;
          }
      }
      
      public void remove(int posicao){
          if(!(posicao >= 0 && posicao < tamanho)){
              throw new IllegalArgumentException("Posição inválida");
          }
          for (int i=posicao; i<this.tamanho-1; i++){
              this.elementos[i] = this.elementos[i+1];
          }
          this.tamanho--;
          }
      
         
      
      }
      


