package br.com.fiap;
import javax.swing.JOptionPane;
public class CalculoArea {public static void main(String[] args) {
    try {
        String aux;
        // Solicita o raio do círculo
        aux = JOptionPane.showInputDialog("Digite o valor do raio do círculo:");

        // Converte o texto para double (número com vírgula)
        double raio = Double.parseDouble(aux);

        // Calcula a área: PI * raio * raio
        double area = 3.14159 * (raio * raio);

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);

    } catch (Exception e) {
        // Caso o utilizador use vírgula em vez de ponto ou digite letras
        JOptionPane.showMessageDialog(null, "Erro: Digite um número válido (use ponto para decimais).");
    }
}
}
