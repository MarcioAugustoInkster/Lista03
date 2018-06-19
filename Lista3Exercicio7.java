import javax.swing.JOptionPane;

public class Lista3Exercicio7 {
    public static String nome = "", pegaNome = "";
    public static int numeroJogador = 4, contador = 0,
        maiorNome = 0, nomeTamanho = 0;


    public static void armazenaValor() {
        while (numeroJogador > 0) {
            nome = JOptionPane.showInputDialog(null, "Entre o Nome do jogador:");
            
            nomeTamanho = nome.length();
            
            if (maiorNome < nomeTamanho) {
                maiorNome = nomeTamanho;

                if (maiorNome < )
                System.out.println(nome + maiorNome);
            }

            

            numeroJogador = numeroJogador - 1;
        }
    }

    public static void main(String[] args) {
        armazenaValor();

        
    }
}