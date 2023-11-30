import javax.swing.JOptionPane;
 
public class Exercicio4 {
 
    public static void main(String[] args) {
        
        String numeroInput = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(numeroInput);
 
        String incrementoInput = JOptionPane.showInputDialog("Digite o incremento:");
        int incremento = Integer.parseInt(incrementoInput);
 
    
        for (int i = 0; i <= numero; i += incremento) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
}