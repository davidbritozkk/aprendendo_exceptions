package exercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite sua senha: ");
            Senha senha = new Senha(sc.nextLine());
            System.out.println(senha.getSenha());
        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }

    }
}
