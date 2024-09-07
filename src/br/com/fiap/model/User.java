package br.com.fiap.model;

import java.util.Scanner;

public class User {

    private String userName;
    private String password;
    private String name;
    private String cpf;
    private String email;
    private String phone;

    // Construtor padrão
    public User() {
    }

    // Construtor com parâmetros
    public User(String name, String cpf, String email, String phone, String userName, String password) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Métodos getters
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUserName() {
        return userName;
    }

    // Método para cadastro de usuário
    public void cadastro(String name, String cpf, String email, String phone, String userName) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.userName = userName;


        System.out.println("Usuario cadastrado com sucesso!");
         }

        public void cadastroSenha (String password){
            while (true) {
                System.out.print("Insira uma senha numerica de 4 digitos: ");
                if (password.matches("\\d{4}")) {
                    this.password = password;
                    System.out.println("Usuário cadastrado com sucesso!");
                    return;
                } else {
                    System.out.println("Senha inválida. A senha deve ter exatamente 4 dígitos numéricos.");
                    return;
                }
            }
        }


        // Método para exibir informações do usuário
        public void exibirInfo () {
            System.out.println("Nome: " + getName());
            System.out.println("CPF: " + getCpf());
            System.out.println("E-mail: " + getEmail());
            System.out.println("Telefone: " + getPhone());
            System.out.println("Nome de usuário para acesso: " + getUserName());
        }
    }


