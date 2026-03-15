package br.com.fiap;
import javax.swing.JOptionPane;

public class MediaJanela {
    public static void main(String[] args) {
        try {
            String aux;
            aux = JOptionPane.showInputDialog("Digite a nota 1:");
            double n1 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite a nota 2:");
            double n2 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite a nota 3:");
            double n3 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite a nota 4:");
            double n4 = Double.parseDouble(aux);

            double media = (n1 + n2 + n3 + n4) / 4;
            JOptionPane.showMessageDialog(null, "A média final é: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto!");
        }
    }
}
