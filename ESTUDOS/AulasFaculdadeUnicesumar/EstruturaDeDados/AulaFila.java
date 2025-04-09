package AulasFaculdadeUnicesumar.EstruturaDeDados;

import java.util.ArrayList;

public class AulaFila {
    private ArrayList<AulaFila> fila = new ArrayList<>();
    private int dadosInseridos= -1;
    private int tam;
    private int ultimo = -1;

    public AulaFila(ArrayList<AulaFila> fila, int dadosInseridos, int tam, int ultimo) {
        this.fila = fila;
        this.dadosInseridos = dadosInseridos;
        this.tam = tam;
        this.ultimo = ultimo;
    }

    public void enfileirar(int valor){
        if (estaVazio()){
            fila[this.ultimo + 1] = valor;
            this.dadosInseridos++;
            this.ultimo++;
        }


    }

    public void desenfileirar(){
        if (estaVazio()){
            return;
        }
        dadosInseridos--;

    }

    public boolean estaVazio(){
        if (fila.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public boolean estaCheia(){
        if (fila.size() == tam){
            return true;
        }else {
            return false;
        }
    }


}

