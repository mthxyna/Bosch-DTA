import javax.swing.JOptionPane;
 
public class Exercicio5 {
 
    public static void main(String[] args) {
        int saldoPositivo = 0;
        int saldoNegativo = 0;
        int totalPessoas = 0;
 
        while (true) {
            String saldoInput = JOptionPane.showInputDialog("Digite o saldo da pessoa:");
            double saldo = Double.parseDouble(saldoInput);
 
            if (saldo >= 0) {
                saldoPositivo++;
            } else {
                saldoNegativo++;
            }
 
            totalPessoas++;
 
            int percentSaldoPositivo = (saldoPositivo * 100) / totalPessoas;
 
            if (percentSaldoPositivo >= 50) {
                JOptionPane.showMessageDialog(null, "Nenhum risco!");
            } else {
                JOptionPane.showMessageDialog(null, "Risco ao banco!");
            }
 
            int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar informando saldos?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
 
            if (continuar != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }
}