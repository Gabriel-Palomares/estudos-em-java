package AulasFaculdadeUnicesumar.POO.SistemaControleEstoque;

import java.util.ArrayList;
import java.util.Iterator;

public class Loja {
    ArrayList<Produto>listaProdutos = new ArrayList<>();

    public void adicionarProduto(String nome, int quantidade){
        listaProdutos.add(new Produto(nome, quantidade));
    }

    public void removerProduto(String nome){
        Iterator <Produto> iterator = listaProdutos.iterator();
        while(iterator.hasNext()){
            Produto produto = iterator.next();
            if (nome.equals(produto.getNome())){
                iterator.remove();
            }
        }
    }

    public void exibirProdutos(){
        for (Produto produto: listaProdutos){
            produto.exibirInfo();
        }
    }
    
}
