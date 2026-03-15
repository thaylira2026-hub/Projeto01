package br.com.fiap;
import javax.swing.JOptionPane;

public class CalculoIdade {public static void main(String[] args) {
    try {
        String aux;

        // Lendo o ano atual
        aux = JOptionPane.showInputDialog("Digite o ano atual:");
        int anoAtual = Integer.parseInt(aux); // Convertendo para número inteiro

        // Lendo o ano de nascimento
        aux = JOptionPane.showInputDialog("Digite o ano do seu nascimento:");
        int anoNascimento = Integer.parseInt(aux);

        // Calculando a idade
        int idade = anoAtual - anoNascimento;

        // Exibindo o resultado em uma janela [cite: 199, 200]
        JOptionPane.showMessageDialog(null, "Sua idade é ou será: " + idade + " anos.");

    } catch (Exception e) {
        // Se o usuário digitar letras em vez de números, cai aqui [cite: 150, 169]
        JOptionPane.showMessageDialog(null, "Por favor, digite apenas números inteiros para os anos.");
    }
}
}
