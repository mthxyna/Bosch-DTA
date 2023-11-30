import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int tamanhoVetor = 10;
        int[] numeros = new int[tamanhoVetor];
        
        Random random = new Random();
        
       
        for (int i = 0; i < tamanhoVetor; i++) {
            numeros[i] = random.nextInt(100); 
        }
        
        StringBuilder numerosSeparados = new StringBuilder();
        for (int i = 0; i < tamanhoVetor; i++) {
            numerosSeparados.append(numeros[i]);
            if (i < tamanhoVetor - 1) {
                numerosSeparados.append(", ");
            }
        }
        
       
        JOptionPane.showMessageDialog(null, "Números aleatórios do vetor:\n" + numerosSeparados);
        
        for (int i = 0; i < tamanhoVetor / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[tamanhoVetor - 1 - i];
            numeros[tamanhoVetor - 1 - i] = temp;
        }
        
        StringBuilder numerosInvertidos = new StringBuilder();
        for (int i = 0; i < tamanhoVetor; i++) {
            numerosInvertidos.append(numeros[i]);
            if (i < tamanhoVetor - 1) {
                numerosInvertidos.append(", ");
            }
        }
        
        JOptionPane.showMessageDialog(null, "Números invertidos do vetor:\n" + numerosInvertidos);
    }
}
