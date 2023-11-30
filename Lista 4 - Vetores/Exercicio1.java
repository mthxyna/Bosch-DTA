import java.util.Random;
 
import javax.swing.JOptionPane;
 
public class Exercicio1 {
 
    public static void main(String[] args) {
 
        boolean naoEstanoVetor = true;
        int posicao = 0;
 
        Random rand = new Random();
 
        int i = 0;
 
        int[] vetor = new int[10];
 
        for (i = 0; i < 10; i++) {
 
            vetor[i] = rand.nextInt(99) + 1;
        }
        for (i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }

        int entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro de 1 até 100: "));
 
        for (i = 0; i < 10; i++) {
            if (entrada == vetor[i]) {
                naoEstanoVetor = false;
 
                posicao = i;
 
            }
        }
 
        if (naoEstanoVetor == false) {
            JOptionPane.showMessageDialog(null,
                    "--- Este número está dentro do vetor! ---" + "\nNa posição " + (posicao + 1) + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Este número não está no vetor! ");
        }
    }
}
 