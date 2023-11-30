import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        for(int i=0; i < 10; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Infrome um valor para a " + (i + 1) + "° posição:"));
    }

    String mostrando = "Os valores do vetor são\n";
    for (int i=0; i<10; i++){
        if(i==9){
            mostrando+=vetor[i]+".";
        }else{
            mostrando+=vetor[i]+".";
        }
    }
    JOptionPane.showMessageDialog(null,mostrando);
}
}