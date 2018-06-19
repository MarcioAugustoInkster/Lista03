import javax.swing.JOptionPane;

public class Lista3Exercicio1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite um nome:");

        while (!nome.equalsIgnoreCase("fim")) {

            nome = JOptionPane.showInputDialog(null, "Digite um nome ou \"fim\" para encerrar");
        }
    }
}