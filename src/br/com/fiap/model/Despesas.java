package br.com.fiap.model;

import java.util.Scanner;

public class Despesas extends OperacaoFinanceira {


    // Construtor
    public Despesas(double valor, String descricao) {
        super(valor, descricao);
    }
   public void addDespesas(double valor, String descricao){
       System.out.println("Despesa: " + descricao + " no valor de: " + valor + " adicionada com sucesso!");
   }
    @Override
    public String toString() {
        return "Despesa: " + descricao + " no valor de: " + valor;
    }
}

