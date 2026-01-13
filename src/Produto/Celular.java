package Produto;

import Loja.*;

public class Celular extends Produto implements Operacoes {
    private int armazenamento;
    public Celular(int armazenamento, String nome, int preco) {
    super(nome, preco);
    this.armazenamento = armazenamento;

    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Celular: " + getNome() + " | Memória: " + armazenamento);
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}


