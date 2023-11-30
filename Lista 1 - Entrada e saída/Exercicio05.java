import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {

            Integer qnthora=Integer.parseInt(JOptionPane.showInputDialog("Informe um horário: "));
            Integer qntmin=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade em minutos: "));
            Integer qntseg= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de segundos: "));
 
        Integer converteHoras = (qnthora * 3600);
        Integer converteMinutos = (qntmin * 60);
        Integer totalSegundos = converteHoras + converteMinutos;

        JOptionPane.showMessageDialog(null, "Esse horário em segundos é "+ totalSegundos);
}
}
