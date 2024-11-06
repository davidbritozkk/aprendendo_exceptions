package exercicio_2;

public class Senha {
    private String senha;

    public Senha(String senha) {
        this.senha = senha;
        if (senha.length() < 8){
            throw new SenhaInvalidaException("Senha inválida. Sua senha deve conter no minimo 8 caracteres");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
