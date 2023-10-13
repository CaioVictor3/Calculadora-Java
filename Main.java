import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("MENU: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            int operacao = scanner.nextInt();

            System.out.println("Digite o primeiro numero: ");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero: ");
            double numero2 = scanner.nextDouble();

            double resultado = realizarOperacao(operacao, numero1, numero2);
            System.out.println("Resultado da operação é: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double realizarOperacao(int operacao, double numero1, double numero2) {
        switch (operacao) {
            case 1:
                return numero1 + numero2;
            case 2:
                return numero1 - numero2;
            case 3:
                return numero1 * numero2;
            case 4:
                if (numero2 == 0) {
                    throw new ArithmeticException("Você não pode ter o número2 igual a zero.");
                }
                return numero1 / numero2;
            default:
                throw new IllegalArgumentException("Operação inválida.");
        }
    }
}
