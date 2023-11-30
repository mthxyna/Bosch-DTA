import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Exercicio07 {
 
 
public static void main(String[] args) {
 
 
DecimalFormat df = new DecimalFormat("R$#,###.00"); 
 
        String nome=JOptionPane.showInputDialog("Nome do vendedor: ");
        String mes=JOptionPane.showInputDialog("Mês correspondente: ");
        Integer carrosVendidos =Integer.parseInt(JOptionPane.showInputDialog("Qual foi o número de carros vendidos? "));
        Double valorTotalVendas = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total das vendas: "));
 
        double salario = 1500; /**Podes nomear as constantes de acordo com a convenção */
        double comissao = carrosVendidos * 350;
        double comissaoSobreValorTotal = valorTotalVendas * 0.001;
        double salarioVendedor = salario + comissao + comissaoSobreValorTotal;
 
      /**É legal acrescentar o R$, veja que pode ser feito lá no df.format, deixei feito para vc  */ 
 
JOptionPane.showMessageDialog(null,nome+" no mês "+mes+" vendeu: \n"+df.format(valorTotalVendas)+"\n Seu salário será: "+df.format(salarioVendedor)+"\n Sua comissão foi: "+df.format(comissao));
    }
}