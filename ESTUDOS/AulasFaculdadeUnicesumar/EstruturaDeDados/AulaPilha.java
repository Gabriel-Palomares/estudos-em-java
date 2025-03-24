package AulasFaculdadeUnicesumar.EstruturaDeDados;

import java.util.ArrayList;

public class AulaPilha {
    private ArrayList<AulaPilha> pilha = new ArrayList<>();
    private int id;

public AulaPilha(int id){
    this.id = id;
}
public void empilhar(int valor){
    pilha.add(new AulaPilha(valor));
}
public void desempilhar(){
    if (pilha.isEmpty()){
        throw new IllegalStateException("Está aulaPilha esta vazia.");
    }
    pilha.remove(pilha.size()-1);
}
public AulaPilha topo(){
    if (pilha.isEmpty()){
        throw new IllegalStateException("Está aulaPilha esta vazia.");
    }
    return pilha.get(pilha.size() - 1);
}
public boolean estaVazio(){
    return pilha.isEmpty();
}
public int tamanho(){
    return pilha.size();
}


}
