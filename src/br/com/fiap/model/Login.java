package br.com.fiap.model;

public class Login {
    private String senha;
    private String entrar;
    User user;
    public Login() {
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEntrar() {
        return entrar;
    }

    public void setEntrar(String entrar) {
        this.entrar = entrar;
    }

    public boolean doLogin(String inputUsername, String inputPassword, User user) {
        if (user == null) {
            System.out.println("Usuário não está inicializado.");
            return false;
        }
        if (inputUsername.equals(user.getUserName()) && inputPassword.equals(user.getPassword())) {
            System.out.println("Login realizado com sucesso!");
            return true;
        }
        System.out.println("Login ou senha incorretos.");
        return false;
    }


    public Login(String senha, String entrar) {
        this.senha = senha;
        this.entrar = entrar;
    }
}
