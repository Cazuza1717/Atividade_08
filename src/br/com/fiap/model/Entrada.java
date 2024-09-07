package br.com.fiap.model;

public class Entrada extends OperacaoFinanceira {

    // Construtor
    public Entrada(double valor, String descricao) {
        super(valor, descricao);  // Chama o construtor da superclasse
    }

    // Método para adicionar entrada
    public void addEntrada(double valor, String descricao) {
        System.out.println("Entrada: " + descricao + " no valor de: " + valor + " adicionada com sucesso!");
    }

    @Override
    public String toString() {
        return "Entrada: " + descricao + " no valor de: " + valor;
    }
}
