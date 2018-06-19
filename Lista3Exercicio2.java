import javax.swing.JOptionPane;

public class Lista3Exercicio2 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Informe uma idade:"));
        
        while (idade < 128) {
            idade = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe uma idade ou \"128\" para sair:"));
        }
    }
}