package Produto;

import Loja.Produto;

public class Celular extends Produto {
    int armazenamento;
    public Celular(int armazenamento, String nome, int preco) {
    super(nome, preco);
    this.armazenamento = armazenamento;

    }
    @Override
    public String toString() {

       return "Celular:  "+ this.nome + "  armazenamento:  " +this.armazenamento+"  Preço  " +this.preco;
    }
}