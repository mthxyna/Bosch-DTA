import javax.swing.JOptionPane;

public class Principal {
    public static void main (String[]args){

        double nota1=EntradaSaida.pedirNota("1º", "");
        boolean notaValida = Validacao.validarNota(nota1);

        while (notaValida == false) {
            nota1 = EntradaSaida.pedirNota("1ª ", "Nota inválida! ");
            notaValida = Validacao.validarNota(nota1);
        }

        
        double nota2= EntradaSaida.pedirNota("2º","");
        notaValida = Validacao.validarNota(nota2);
        while (notaValida == false) {
            nota2 = EntradaSaida.pedirNota("2ª ", "Nota inválida! ");
            notaValida = Validacao.validarNota(nota2);
        }

        double mediaAritimetica=Calculo.calcularMedia(nota1, nota2);
        


        int opcao= EntradaSaida.informarOp();
        
        if (opcao == 1) {
            JOptionPane.showMessageDialog(null,"A média é: "+mediaAritimetica);
            Resultado.aprovacaoAri(mediaAritimetica);

        } else if (opcao == 2) {
            double peso1 = EntradaSaida.pedirPeso("1º");
            double peso2 = EntradaSaida.pedirPeso("2º");
            double mediaPonderada = Calculo.calcularPonderada(nota1,nota2,peso1,peso2);
            JOptionPane.showMessageDialog(null,"A média é: "+mediaPonderada);
            Resultado.aprovacaoPon(mediaPonderada);
        }

    }
}