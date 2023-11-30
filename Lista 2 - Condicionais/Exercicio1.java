import javax.swing.JOptionPane;
 
public class Exercicio1 {
    public static void main (String[]args){
        Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade? "));
 
        if (idade >= 0 && idade < 14) {
            JOptionPane.showMessageDialog(null, "Você é uma criança!");
        }
 
        if (idade >= 15 && idade < 17){
            JOptionPane.showMessageDialog(null, "Você é um adolescente!");
        }
 
        if (idade >= 18 && idade <30){
            JOptionPane.showMessageDialog(null, "Você é um adulto jovem!");
        }
        
        if (idade >=30){
            JOptionPane.showMessageDialog(null, "Você é um adulto!");
        }
    }
}