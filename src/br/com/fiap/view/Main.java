package br.com.fiap.view;

import br.com.fiap.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        Login login = new Login();
        Financeiro financeiro = new Financeiro();
        boolean sairPrograma = false;
        System.out.println("Seja bem-vindo!");

        while (!sairPrograma) {
            System.out.println("Insira uma opção: \n1 - Cadastro de usuário\n2 - Login\n0 - Para finalizar o programa");
            int op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Cadastro de usuário");
                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF do usuário: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite o e-mail do usuário: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite o telefone do usuário: ");
                    String phone = scanner.nextLine();
                    System.out.print("Insira um nome para login: ");
                    String userName = scanner.nextLine();
                    user.cadastro(nome, cpf, email, phone, userName);

                    boolean senhaValida = false;

                    while (!senhaValida) {
                        System.out.print("Cadastre uma senha numérica de 4 dígitos: ");
                        String senha = scanner.nextLine();
                        if (senha.matches("\\d{4}")) {
                            user.cadastroSenha(senha);
                            senhaValida = true;
                        } else {
                            System.out.println("Senha inválida, insira uma senha válida de 4 dígitos numéricos");
                        }
                    }
                    user.exibirInfo();
                    break;

                case 2:
                    System.out.print("Digite o login de usuário: ");
                    String loginUser = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();

                    if (login.doLogin(loginUser, senha, user)) {
                        System.out.println("Seja bem-vindo " + user.getName() + "\n O seu saldo é de " + financeiro.totalConta());
                        boolean sair = false;
                        while (!sair) {
                            System.out.println("\nSaldo atual: " + financeiro.totalConta() + "\nInsira uma opção: \n1 - Despesas\n2 - Entradas\n0 - Para sair da conta");
                            int ap = scanner.nextInt();
                            scanner.nextLine();

                            switch (ap) {
                                case 1:
                                    boolean sairDespesa = false;
                                    while (!sairDespesa) {
                                        System.out.println("Insira uma opção: \n1 - Adicionar despesa\n2 - Exibir despesas\n0 - Sair");
                                        int ip = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (ip) {
                                            case 1:
                                                System.out.println("Insira o valor da despesa: ");
                                                double valorDespesa = scanner.nextDouble();
                                                scanner.nextLine();
                                                System.out.println("Insira uma descrição: ");
                                                String descricaoDespesa = scanner.nextLine();

                                                Despesas despesa = new Despesas(valorDespesa, descricaoDespesa);
                                                financeiro.adicionarDespesa(despesa);
                                                break;
                                            case 2:
                                                financeiro.exibirDespesas();
                                                break;
                                            case 0:
                                                sairDespesa = true;
                                                break;
                                            default:
                                                System.out.println("Opção inválida");
                                        }
                                    }
                                    break;

                                case 2:
                                    boolean sairEntradas = false;
                                    while (!sairEntradas) {
                                        System.out.println("Insira uma opção: \n1 - Adicionar entradas\n2 - Exibir entradas\n0 - Sair");
                                        int qp = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (qp) {
                                            case 1:
                                                System.out.println("Insira o valor da entrada: ");
                                                double valorEntrada = scanner.nextDouble();
                                                scanner.nextLine();
                                                System.out.println("Insira uma descrição: ");
                                                String descricaoEntrada = scanner.nextLine();

                                                Entrada entrada = new Entrada(valorEntrada, descricaoEntrada);
                                                financeiro.adicionarEntrada(entrada);
                                                break;
                                            case 2:
                                                financeiro.exibirEntradas();
                                                break;
                                            case 0:
                                                sairEntradas = true;
                                                break;
                                            default:
                                                System.out.println("Opção inválida");
                                        }
                                    }
                                    break;

                                case 0:
                                    System.out.println("Saindo da conta.");
                                    sair = true;
                                    break;

                                default:
                                    System.out.println("Opção inválida");
                            }
                        }
                    } else {
                        System.out.println("Login ou senha incorretos.");
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    sairPrograma = true;
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
