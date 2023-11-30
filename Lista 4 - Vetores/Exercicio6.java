import javax.swing.JOptionPane;

public class Exercicio6 {

  public static void main(String[] args) {
    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int[] vetorResultado = new int[10];

    for (int i = 0; i < 10; i++) {
      int inputVetor1 = Integer.parseInt(
        JOptionPane.showInputDialog(
          "Digite 10 números inteiros para preencher o primeiro vetor: "
        )
      );

      vetor1[i] = inputVetor1;

      int inputVetor2 = Integer.parseInt(
        JOptionPane.showInputDialog(
          "Digite 10 números inteiros para preencher o segundo vetor: "
        )
      );

      vetor2[i] = inputVetor2;
    }
    
    for (int i = 0; i < 10; i++) {
      vetorResultado[i] = vetor1[i] + vetor2[i];
      System.out.println(vetorResultado[i]);
    }
  }
}
