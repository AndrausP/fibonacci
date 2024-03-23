import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    try {
      int numero = scanner.nextInt();

      if (numero < 0) {
        System.out.println("O número precisa ser um inteiro não negativo.");
        return;
      }

      int a = 0, b = 1, proximo;

      for (int i = 0; i < numero; i++) {
        if (b == numero) {
          System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
          return;
        }
        proximo = a + b;
        a = b;
        b = proximo;
      }

      System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
    } catch (Exception e) {
      System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro válido.");
    }
  }
}
