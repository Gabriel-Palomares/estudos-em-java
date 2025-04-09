package AulasFaculdadeUnicesumar.POO.BibliotecaComUsuario;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro>livrosBiblioteca = new ArrayList<>();
    ArrayList<Usuario>usuarios = new ArrayList<>();


    public boolean livroExiste(String isbn){
        for (Livro livro: livrosBiblioteca){
            if (isbn.equals(livro.getIsbn())){
                return true;
            }
        }
        return false;
    }


    public boolean usuarioExiste(int id){
        for (Usuario usuario: usuarios){
            if (id == usuario.getId()){
                return true;
            }
        }
        return false;
    }

    public void cadastrarLivro(String titulo, String autor, String isbn, boolean emprestado){
        if (livroExiste(isbn)){
            System.out.println("Este livro ja esta cadastrado");
        }else {
            livrosBiblioteca.add(new Livro(titulo, autor, isbn, emprestado));
        }
    }

    public void removerLivro(String isbn){
        int i = 0;
        if (livroExiste(isbn)){
            for (Livro livro: livrosBiblioteca){
                if (isbn.equals(livro.getIsbn())){
                    livrosBiblioteca.remove(i);
                }
                i++;
            }
        }else {
            System.out.println("Cadastro do Livro não encontrado");
        }
    }

    public void registrarUsuario(String nome, int id){
        if (usuarioExiste(id)){
            System.out.println("Usuario ja cadastrado");
        }else {
            usuarios.add(new Usuario(nome, id));
        }
    }

    public void emprestarLivro(String isbn, int id){
        if (usuarioExiste(id)){
            if (livroExiste(isbn)){

            }
        }
    }


    public void devolverLivro(String isbn, Usuario usuario){

    }

}
