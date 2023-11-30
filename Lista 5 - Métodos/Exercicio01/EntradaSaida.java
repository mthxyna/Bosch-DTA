
import javax.swing.JOptionPane;

public class EntradaSaida {
    public static double pedirNota(String contador, String mensagem){
        return Double.parseDouble(JOptionPane.showInputDialog(mensagem +"Informe a "+contador+" nota"));
    }
public static double pedirPeso (String cont){
    return Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da "+cont+" nota seguindo o exemplo:\n"+"Ex: 40% = 0.4"));
}

public static int informarOp (){
return Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção para o calculo da média: \n"+"1 - Média aritimética \n"+"2 - Média ponderada"));
}

public static void mostrarMedias (double nota1, double nota2, int opcao){
     




}




}
