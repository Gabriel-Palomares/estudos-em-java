package AulasFaculdadeUnicesumar.POO.BibliotecaComUsuario;

public class Livro extends Biblioteca {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public Livro(String titulo, String autor, String isbn, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = emprestado;
    }

    public boolean livroExiste(String isbn){
        for (Livro livro: livros){
            if (isbn.equals(livro.isbn)){
                return true;
            }
        }
        return false;
    }

    public void emprestar(){
        if (emprestado = true){
            System.out.println("Este Livro esta emprestado");
        }else {
            this.emprestado = true;
        }
    }

    public void devolver(){
        if (emprestado = false){
            System.out.println("Este livro não foi emprestado");
        }else {
            this.emprestado = false;
        }
    }

    public void exibirInfo(){
        System.out.print("O livro " + getTitulo() + " do autor(a) " + getAutor() + " seu codigo de livro é " + getIsbn() + " e sua situação de empréstimo é: " + getEmprestado());
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
