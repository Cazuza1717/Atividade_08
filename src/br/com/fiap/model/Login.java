package br.com.fiap.model;

public class Login {
    // Construtor padrão
    public Login() {
    }

    // Método para realizar o login
    public boolean doLogin(String inputUsername, String inputPassword, User user) {
        // Verificar se o nome de usuário e a senha fornecidos correspondem aos do usuário
        if (inputUsername.equals(user.getUserName()) && inputPassword.equals(user.getPassword())) {
            System.out.println("Login realizado com sucesso!");
            return true;
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
            return false;
        }
    }
}
