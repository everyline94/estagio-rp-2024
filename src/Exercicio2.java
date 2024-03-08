import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite um número inteiro para verificar se pertence a sequencia de fibonacci: ");
        int numero = sc.nextInt();

        boolean pertence = verificarFibonacci(numero);

        if (pertence)
            System.out.println(numero + " pertence a sequencia de Fibonacci.");
        else
            System.out.println(numero + " não pertence a sequencia de Fibonacci.");

        sc.close();
    }

    static boolean verificarFibonacci(int numero) {

        int a = 0;
        int b = 1;

        if (numero == a || numero == b)
            return true;

        while (b <= numero) {
            if (b == numero)
                return true;

            int proximo = a + b;
            a = b;
            b = proximo;
        }

        return false;
    }
}