package br.com.fiap.model;

import java.util.ArrayList;
import java.util.List;

public class Financeiro {
    // Listas para armazenar despesas e entradas
    private List<Despesas> listaDespesas = new ArrayList<>();
    private List<Entrada> listaEntradas = new ArrayList<>();

    // Método para adicionar uma despesa à lista
    public void adicionarDespesa(Despesas despesa) {
        listaDespesas.add(despesa);
    }

    // Método para adicionar uma entrada à lista
    public void adicionarEntrada(Entrada entrada) {
        listaEntradas.add(entrada);
    }

    // Método para calcular o total de despesas
    public double calcularTotalDespesas() {
        double totalDespesas = 0;
        for (Despesas despesa : listaDespesas) {
            totalDespesas += despesa.getValor();
        }
        return totalDespesas;
    }

    // Método para calcular o total de entradas
    public double calcularTotalEntradas() {
        double totalEntradas = 0;
        for (Entrada entrada : listaEntradas) {
            totalEntradas += entrada.getValor();
        }
        return totalEntradas;
    }

    // Método para exibir todas as despesas
    public void exibirDespesas() {
        System.out.println("Lista de Despesas:");
        for (Despesas despesa : listaDespesas) {
            System.out.println(despesa);
        }
        System.out.println("Total de Despesas: " + calcularTotalDespesas());
    }

    // Método para exibir todas as entradas
    public void exibirEntradas() {
        System.out.println("Lista de Entradas:");
        for (Entrada entrada : listaEntradas) {
            System.out.println(entrada);
        }
        System.out.println("Total de Entradas: " + calcularTotalEntradas());
    }
    public double totalConta(){
        double total = calcularTotalEntradas() - calcularTotalDespesas();
        System.out.println("O total em conta é: " + total);
        return total;
    }
}
