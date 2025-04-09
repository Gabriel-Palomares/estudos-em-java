package AulasFaculdadeUnicesumar.POO.BibliotecaComUsuario;

import java.util.ArrayList;

public class Usuario extends Biblioteca{
    private String nome;
    private int id;
    ArrayList<Livro>livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public void adicionarLivro(){
        boolean verificar;
    }

    public void removerLivro(){

    }

    public void exibirLivrosEmprestados(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
