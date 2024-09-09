package br.com.fiap.model;

import java.util.Scanner;

public class Despesas extends OperacaoFinanceira {
    private int qtdParcelas;
    private double valorTotal;

    // Construtor
    public Despesas(double valor, String descricao) {
        super(valor, descricao);}

    public Despesas(double valor, String descricao,int parcelas, double valorTotal ){
        super(valor, descricao);
        this.qtdParcelas = parcelas;
        this.valorTotal = valorTotal;
    }
//
//   public void addDespesas(double valor, String descricao){
//       System.out.println("Despesa: " + descricao + " no valor de: " + valor + " adicionada com sucesso!");
//   }
    @Override
    public String toString() {
        return "Despesa: " + descricao + " no valor de: " + valor;
    }
}

