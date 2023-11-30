import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        double valorCompra= Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de compra do produto: "));

        double valorRepresentante= valorCompra *0.2;
        double valorImpostos= valorCompra *0.3;
        double valorVenda= valorCompra+valorRepresentante+valorImpostos;

    JOptionPane.showMessageDialog(null, "O valor da Venda é: \n"+valorVenda+"\n O valor do Representante é: \n"+valorRepresentante+"\n O valor dos impostos é: \n"+valorImpostos);

}
}