import java.text.DecimalFormat;
 
import javax.swing.JOptionPane;
 
public class Exercicio2 {
   
    public static void main(String[] args) {
 
    DecimalFormat df = new DecimalFormat("#,###.00");
       
 
 
    double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
    int quantidadeProduto = Integer.parseInt(JOptionPane.showInputDialog("Quantas unidades?"));
 
    double taxaDesconto = 0.1;
    double valorTotal = valorProduto * quantidadeProduto;
 
 
    if (quantidadeProduto <= 12) {
 
        valorTotal = valorProduto * quantidadeProduto;
    }
 
    if (quantidadeProduto > 12) {
 
        double descontoTotal = taxaDesconto * quantidadeProduto * valorProduto;
 
        valorTotal = (valorProduto * quantidadeProduto) - descontoTotal;
 
    }
 
    JOptionPane.showMessageDialog(null, "Valor total da compra: " + df.format((valorTotal)));
    }
}