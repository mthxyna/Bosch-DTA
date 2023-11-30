
import javax.swing.JOptionPane;

public class EntradaSaida {
    public static double pedirSalario (String mensagem) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensagem+"Informe seu salário bruto: "));
    }

    public static int pedirHorasExtras(){
        return Integer.parseInt(JOptionPane.showInputDialog("Informe suas horas extras: "));
    }
    
    public static void mostrarSalario (double salarioLiquido){
        JOptionPane.showMessageDialog(null, "O salário líquido do colaborador é "+ salarioLiquido);
    }


    }
