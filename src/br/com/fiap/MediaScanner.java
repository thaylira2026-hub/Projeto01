package br.com.fiap;
import java.util.Scanner;

public class MediaScanner {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Digite a nota 1:");
                double n1 = scan.nextDouble();
                System.out.println("Digite a nota 2:");
                double n2 = scan.nextDouble();
                System.out.println("Digite a nota 3:");
                double n3 = scan.nextDouble();
                System.out.println("Digite a nota 4:");
                double n4 = scan.nextDouble();

                double media = (n1 + n2 + n3 + n4) / 4;
                System.out.println("A média final é: " + media);
            } catch (Exception e) {
                System.out.println("Erro: Digite apenas números.");
            }
        }
    }
