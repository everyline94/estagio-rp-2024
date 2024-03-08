import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra para inverter: ");
        String palavra = sc.nextLine();

        sc.close();

        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + palavraInvertida);
    }
}
