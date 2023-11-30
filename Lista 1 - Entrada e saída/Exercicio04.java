import javax.swing.JOptionPane;

public class Exercicio04 {
        public static void main(String[] args) {
            Integer num1=Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
            Integer antecessor=num1-1;
            Integer sucessor=num1+1;

            JOptionPane.showMessageDialog(null, "O número informado foi: "+num1+"\n O número sucessor a ele é: "+sucessor+"\n O número antecessor a ele é: "+antecessor);
}
}
    