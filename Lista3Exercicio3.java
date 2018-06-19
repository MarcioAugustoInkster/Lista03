import javax.swing.JOptionPane;

public class Questao3 {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso:"));
        int quantidade = 0;
        
        while (peso >= 0 && peso <= 300) {
            peso = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Menor que \"0\" e maior que \"300\" encerra\n\nInforme um novo peso: "));
            
            quantidade = quantidade + 1;
        }
        JOptionPane.showMessageDialog(null, quantidade + " pessoas informaram o peso");
    }
}