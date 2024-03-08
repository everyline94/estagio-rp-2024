import java.util.Scanner;

public class Exercicio4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Você está na sala dos interruptores");
            System.out.println("Existem 3 interruptores aqui e você pode ligá-los e desligá-los quantas vezes quiser");
            System.out.println("O objetivo é descobrir qual interruptor controla cada lâmpada");
            System.out.println("Pressione ENTER para começar.");
            sc.nextLine();

            System.out.println("Ligando o interruptor 1");
            aguardarEnter(sc);
            System.out.println("Desligando o interruptor 1");

            System.out.println("Pressione ENTER para ligar o interruptor 2");
            aguardarEnter(sc);
            System.out.println("Você está na sala das lâmpadas");
            System.out.println("Observando o estado das lâmpadas");
            System.out.println("Se uma lâmpada estiver acesa, o interruptor 1 controla essa lâmpada");
            System.out.println("Se uma lâmpada estiver apagada, mas estiver quente, o interruptor 2 controla essa lâmpada");
            System.out.println("Se uma lâmpada estiver apagada e fria, o interruptor 3 controla essa lâmpada");

            sc.close();
        }

        static void aguardarEnter(Scanner sc) {
            System.out.println("Pressione ENTER para continuar");
            sc.nextLine();
        }
    }

