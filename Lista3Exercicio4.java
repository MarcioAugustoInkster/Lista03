import javax.swing.JOptionPane;

public class Lista3Exercicio4 {
    public static void main(String[] args) {
        int anoCarro = 0, mediaAnoCarro = 0, somaAnoCarro = 0, contador = 0,
            contaLetraA = 0, contaLetraG = 0, quantidadeCarros = Integer.parseInt(
            JOptionPane.showInputDialog(null, "*** CONSORCIO CARROS BLUMENAU ***" + 
                "\n\nQuantidade de carros para registrar:"));
        String modeloCarro = "", somaModeloCarro = "";
        double valorCarro = 0, somaValorCarro = 0, mediaValorCarro = 0;
        char letra;
        
        contador = quantidadeCarros;

        while (quantidadeCarros > 0) {
            modeloCarro = JOptionPane.showInputDialog("Modelo:");
            valorCarro = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor (R$):"));
            anoCarro = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Restantes: " + quantidadeCarros + "\n\nAno:"));
            
            somaAnoCarro = somaAnoCarro + anoCarro;
            somaValorCarro = somaValorCarro + valorCarro;
            quantidadeCarros = quantidadeCarros - 1;

            letra = modeloCarro.charAt(0);
        
            if (letra == 'G' || letra == 'g') {
                contaLetraA = contaLetraA + 1;
            } else if (letra == 'A' || letra == 'a') {
                contaLetraG = contaLetraG + 1;
            }

            somaModeloCarro = somaModeloCarro + "\n" + modeloCarro;
        }
        mediaAnoCarro = somaAnoCarro / contador;
        mediaValorCarro = somaValorCarro / contador;
        
        JOptionPane.showMessageDialog(null, 
            "*** RESULTADO FICHA CONCESSIONARIA ***\n" +
            "\nModelos: " + somaModeloCarro +
            "\n\nMédia anual dos carros: " + mediaAnoCarro +
            "\nMedia de preço: R$" + mediaValorCarro +
            "\nModelos Inicial com 'G': " + contaLetraA +
            "\nModelos Inicial com 'A': " + contaLetraG);

    }
}