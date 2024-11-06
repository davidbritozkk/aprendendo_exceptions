package exercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Digite o valor de x: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        y = sc.nextInt();
        try {
            int resultado = x/y;
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("Impossível dividir por zero: " + e.getMessage());
        }
    }
}
