package AulasFaculdadeUnicesumar.POO.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Autor extends Teste {
    private String nome;
    private String nacionalidade;



    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public void exibir(){
        System.out.println("O autor " + getNome() + " do(a) " + getNacionalidade());
    }
    }

