package estruturadedados2;

public class Lista {
    private int[] elementos;
    private int ultimo, maximo;
    
     public Lista(int capacidade){
       this.elementos = new int[capacidade];
       this.maximo = 100;
    }  
             
    public void iniciaLista (){
        this.ultimo = -1;
    }  
     
    
public boolean listaCheia(){
    if(this.ultimo == this.maximo - 1){
        return true;
    }
    else{
        return false;
    }
}

public boolean listaVazia(){
    if(this.ultimo == - 1){
        return true;
    }
    else{
        return false;
    }
}

public void adicionaNoInicio(int elemento, int posicao){
          if(listaCheia()){ 
              System.out.println ("Lista está cheia");
          }
          else{
            this.ultimo = this.ultimo + 1;
            posicao = this.ultimo;
            while( posicao > 0){
                this.elementos[posicao] = this.elementos[posicao-1];
                posicao = posicao -1;
            }
            this.elementos[0] = elemento;
          }                           
}

public int adiciona(int elemento){
    int erroListaCheia = -1;
     if(listaCheia()){ 
              return(erroListaCheia);
          }
          else{
         this.ultimo = this.ultimo + 1;
         this.elementos[this.ultimo] = elemento;
         return (this.ultimo);
     }      
}

    private int adicionaNaPosicao(int elemento, int posicao) {
    int destino = 0;
    int erroPosicao = -3;
    int erroListaCheia = -1;
    if(listaCheia()){ 
              return(erroListaCheia);
          }
    else if(destino> this.ultimo + 1){
        return (erroPosicao);
    }
    this.ultimo = this.ultimo + 1;
    posicao = this.ultimo;
    while (posicao > destino){
        this.elementos[posicao] = this.elementos[posicao-1];
        posicao = posicao -1 ;
    }
    this.elementos[destino] = elemento;
    return (destino);
}        

public int retira(){
    int erroListaVazia = -2;
    if(listaVazia()){ 
              return(erroListaVazia);
          }
    else {
        this.ultimo = this.ultimo -1;
        return (this.elementos[this.ultimo + 1]);
    }
}

public int retiraDoInicio(int posicao, int valor){
    int erroListaVazia = -2;
    if(listaVazia()){ 
              return(erroListaVazia);
          }
    else {
        this.ultimo = this.ultimo -1;
        valor = this.elementos[0];
        posicao = 0;
        while (posicao == this.ultimo){
            this.elementos[posicao] = this.elementos[posicao+1];
            posicao = posicao + 1;         
        }
        return (valor);
    }
} 

private int retiraDaPosicao(int posicao) {
    int fonte = 0;
    int valor;
    int erroPosicao = -3;
    int erroListaVazia = -2;
    if ( fonte > this.ultimo){
        return (erroPosicao);
    }
    else if(listaVazia()){
        return(erroListaVazia);
    }
    else {
        this.ultimo = this.ultimo -1;
        valor = this.elementos[fonte];
        posicao = fonte;
        while (posicao == this.ultimo){
            this.elementos[posicao] = this.elementos[posicao +1];
            posicao = posicao + 1;           
        }
        return (valor);
    }
}

private int posicao(int elemento) {      
    int posicao = 0;
    int erroPosicao = -3;
    while (posicao == this.ultimo && posicao!=elemento && posicao!=this.elementos[posicao]) {
    posicao = posicao +1;
    }
    if (posicao > this.ultimo){
        return (erroPosicao);
    } else{
        return (posicao);
    }
}

public int retiraEspecifico (int elemento, int posicao){
    int erroListaVazia = -2;
    int erroPosicao = -3;
    if(listaVazia()){
        return(erroListaVazia);
    }
    else{ posicao = posicao(elemento);
    }
    if (posicao < 0){
        return (erroPosicao);
    } else {
        return (retiraDaPosicao(posicao));
    }
}

public int adicionaEmOrdem (int elemento){
    int posicao;
    int erroListaCheia = -1;
    if(listaCheia()){ 
              return(erroListaCheia);
          }
    else{
        posicao = 0;
        while (posicao == this.ultimo && posicao > elemento && posicao> this.elementos[posicao]){
            posicao = posicao + 1;
        }
        return (adicionaNaPosicao(elemento,posicao));
    }
}

public boolean maior (int elemento1, int elemento2){
    if (elemento1>elemento2){
        return true;
    } else{
        return false;
    }
}
}









