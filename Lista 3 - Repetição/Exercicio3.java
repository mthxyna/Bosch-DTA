import java.text.DecimalFormat;

import javax.swing.JOptionPane;
 
public class Exercicio3 {
 
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        DecimalFormat outroDf = new DecimalFormat("#,###");


        int otimoCount = 0;
        int bomCount = 0;
        int ruimCount = 0;
        int totalRespostas = 0;
 
        while (true) {
            String resposta = JOptionPane.showInputDialog(
                    "--- Opinião sobre o filme: ---\n" +
                            "1 - Ótimo\n" +
                            "2 - Bom\n" +
                            "3 - Ruim\n" +
                            "Digite 's' para sair");
 
            if (resposta == null || resposta.equals("s")) {
                break;
            }
 
            int opcao = Integer.parseInt(resposta);
 
            switch (opcao) {
                case 1:
                    otimoCount++;
                    break;
                case 2:
                    bomCount++;
                    break;
                case 3:
                    ruimCount++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
 
            totalRespostas++;
        }
        double percentoOtimo = (double) otimoCount / totalRespostas * 100;
        double percentoBom = (double) bomCount / totalRespostas * 100;
        double percentoRuim = (double) ruimCount / totalRespostas * 100;
        double media = otimoCount+bomCount+ruimCount/totalRespostas;
 
        JOptionPane.showMessageDialog(null,
                "--- Respostas sobre o filme: ---\n" +
                        "Quantidade de respostas Ótimo: " + outroDf.format(otimoCount) + " (" + df.format(percentoOtimo) + "%)\n" +
                        "Quantidade de respostas Bom: " + outroDf.format(bomCount) + " (" + df.format(percentoBom) + "%)\n" +
                        "Quantidade de respostas Ruim: " + outroDf.format(ruimCount) + " (" + df.format(percentoRuim) + "%)\n" +
                         "Total de respostas: " + totalRespostas+ "\n" +
                         "Media: "+ df.format(media));
    }
}
 