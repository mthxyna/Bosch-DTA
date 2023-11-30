    import javax.swing.JOptionPane;

public class Resultado {

    public static void aprovacaoAri (double mediaAritimetica){
    //aprovação para a média aritimética

    if (mediaAritimetica >= 7) {
        JOptionPane.showMessageDialog(null,"Aprovado!");
    } else {
        JOptionPane.showMessageDialog(null, "Reprovado!");
    }
    }

    public static void aprovacaoPon (double mediaPonderada){
    //aprovação p média ponderada

    if (mediaPonderada >= 7) {
        JOptionPane.showMessageDialog(null, "Aprovado");
    } else {
        JOptionPane.showMessageDialog(null, "Reprovado");
    }
}
}



