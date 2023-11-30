import javax.swing.JOptionPane;
 
public class Exercicio2 {
 
    public static void main(String[] args) {

 
    int acima50 = 0;
    int acima160 = 0;
    int abaixo80kg = 0;
 
    for (int i = 1; i <= 10; i++) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa " + i + ":"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa " + i + ":"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa " + i + ":"));
 
        if (idade > 50) {
            acima50++;
        }
 
        if (altura > 1.60) {
            acima160++;
        }
 
        if (peso < 80) {
            abaixo80kg++;
        }
    }
     JOptionPane.showMessageDialog(null, "Pessoas com idade acima de 50 anos: " + acima50 + "\nPessoas com altura acima de 1.60m: " + acima160 +"\nPessoas com peso abaixo de 80kg: " + abaixo80kg);
    }
}