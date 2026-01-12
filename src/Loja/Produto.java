package Loja;

public class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
