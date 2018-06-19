import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class Lista3Exercicio7 {
    public static double menorPeso = 0;
    public static String nome = "", menorNome = "";
    public static int count = 22;

    public static void armazenaValores() {
        //String nome = "";
        
        String nome1 = "Cafu", 
            nome2 = "Lucio", 
            nome3 = "Roque Junior", 
            nome4 = "Edmilson", 
            nome5 = "Roberto Carlos", 
            nome6 = "Ricardinho",
            nome7 = "Gilberto Silva", 
            nome8 = "Ronaldo", 
            nome9 = "Rivaldo", 
            nome10 = "Ronaldinho Gaucho", 
            nome11 = "Dida", 
            nome12 = "Belletti", 
            nome13 = "Anderson Polga", 
            nome14 = "Kleberson", 
            nome15 = "Junior", 
            nome16 = "Denilson", 
            nome17 = "Vampeta", 
            nome18 = "Juninho Paulista", 
            nome19 = "Edilson", 
            nome20 = "Luizao", 
            nome21 = "Rogerio Ceni", 
            nome22 = "kaka";
        
        int idade1 = 29, 
            idade2 = 31, 
            idade3 = 25, 
            idade4 = 21, 
            idade5 = 27, 
            idade6 = 30, 
            idade7 = 28, 
            idade8 = 33, 
            idade9 = 21, 
            idade10 = 28, 
            idade11 = 30, 
            idade12 = 26, 
            idade13 = 26, 
            idade14 = 29, 
            idade15 = 30, 
            idade16 = 24, 
            idade17 = 29, 
            idade18 = 31, 
            idade19 = 23, 
            idade20 = 25, 
            idade21 = 27, 
            idade22 = 24;

        double peso1 = 76, 
            peso2 = 78, 
            peso3 = 77.5, 
            peso4 = 63, 
            peso5 = 67.60, 
            peso6 = 71.30, 
            peso7 = 66.50, 
            peso8 = 69.30, 
            peso9 = 74.50, 
            peso10 = 68, 
            peso11 = 78, 
            peso12 = 73.60, 
            peso13 = 69, 
            peso14 = 63, 
            peso15 = 78, 
            peso16 = 72.50, 
            peso17 = 68.60, 
            peso18 = 71, 
            peso19 = 70, 
            peso20 = 75, 
            peso21 = 70.30, 
            peso22 = 67;

        char masculino = 'M', feminino = 'F';

        double altura1 = 1.72, 
            altura2 = 1.79, 
            altura3 = 1.80, 
            altura4 = 1.81, 
            altura5 = 1.78, 
            altura6 = 1.89, 
            altura7 = 1.80, 
            altura8 = 1.77, 
            altura9 = 1.78, 
            altura10 = 1.79, 
            altura11 = 1.83, 
            altura12 = 1.82, 
            altura13 = 1.79, 
            altura14 = 1.84, 
            altura15 = 1.82, 
            altura16 = 1.86, 
            altura17 = 1.78, 
            altura18 = 1.81, 
            altura19 = 1.77, 
            altura20 = 1.82, 
            altura21 = 1.85, 
            altura22 = 1.78;
        
        int totalGols1 = 4, 
            totalGols2 = 1, 
            totalGols3 = 3, 
            totalGols4 = 2, 
            totalGols5 = 0, 
            totalGols6 = 1, 
            totalGols7 = 0, 
            totalGols8 = 4, 
            totalGols9 = 0, 
            totalGols10 = 2, 
            totalGols11 = 1, 
            totalGols12 = 0, 
            totalGols13 = 3, 
            totalGols14 = 5, 
            totalGols15 = 7, 
            totalGols16 = 2, 
            totalGols17 = 6, 
            totalGols18 = 1, 
            totalGols19 = 0, 
            totalGols20 = 5, 
            totalGols21 = 2, 
            totalGols22 = 0;
        
        int totalCartaoAmarelo1 = 0, 
            totalCartaoAmarelo2 = 1, 
            totalCartaoAmarelo3 = 3, 
            totalCartaoAmarelo4 = 2, 
            totalCartaoAmarelo5 = 4, 
            totalCartaoAmarelo6 = 0, 
            totalCartaoAmarelo7 = 0, 
            totalCartaoAmarelo8 = 2, 
            totalCartaoAmarelo9 = 0, 
            totalCartaoAmarelo10 = 1, 
            totalCartaoAmarelo11 = 3, 
            totalCartaoAmarelo12 = 1, 
            totalCartaoAmarelo13 = 2, 
            totalCartaoAmarelo14 = 3, 
            totalCartaoAmarelo15 = 3, 
            totalCartaoAmarelo16 = 0, 
            totalCartaoAmarelo17 = 1, 
            totalCartaoAmarelo18 = 0, 
            totalCartaoAmarelo19 = 1, 
            totalCartaoAmarelo20 = 0, 
            totalCartaoAmarelo21 = 2, 
            totalCartaoAmarelo22 = 2;

        int totalCartaoVermelho1 = 0, 
            totalCartaoVermelho2 = 0, 
            totalCartaoVermelho3 = 0, 
            totalCartaoVermelho4 = 1, 
            totalCartaoVermelho5 = 0, 
            totalCartaoVermelho6 = 0, 
            totalCartaoVermelho7 = 0, 
            totalCartaoVermelho8 = 0, 
            totalCartaoVermelho9 = 0, 
            totalCartaoVermelho10 = 0, 
            totalCartaoVermelho11 = 0, 
            totalCartaoVermelho12 = 0, 
            totalCartaoVermelho13 = 1, 
            totalCartaoVermelho14 = 0, 
            totalCartaoVermelho15 = 0, 
            totalCartaoVermelho16 = 0, 
            totalCartaoVermelho17 = 0, 
            totalCartaoVermelho18 = 1, 
            totalCartaoVermelho19 = 0, 
            totalCartaoVermelho20 = 0, 
            totalCartaoVermelho21 = 2, 
            totalCartaoVermelho22 = 0;
        //if (value > maxValue) {maxValue = value}
        //while (cont > 0) {
            nome = JOptionPane.showInputDialog(null, "Entre o nome do jogador:");
            System.out.println(nome.lenght());
            menorNome = menorNome + nome;

            
            
            count = count - 1;
        //}

        //while (count > 0) {
        //    nome = JOptionPane.showMessageDialog(null, "Nome Completo:");
        //}
    }

    public static void main(String[] args) {
        armazenaValores();
    }
}