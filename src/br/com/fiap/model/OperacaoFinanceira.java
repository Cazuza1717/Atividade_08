package br.com.fiap.model;

public class OperacaoFinanceira {
    protected double valor;
    protected String descricao;

    public OperacaoFinanceira(double valor, String descricao){
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void exibirDetalhes(){
        System.out.println("Descrição: " + descricao + ", Valor: " + valor);

    }

}
