import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        String nome=JOptionPane.showInputDialog("Informe seu nome: "); 
        String sobrenome= JOptionPane.showInputDialog("Informe seu sobrenome:");
        String dataNascimento= JOptionPane.showInputDialog("Informe a sua data de nascimento: "); /**Orientar o usuário o que ele deve informar aqui ex.: 10/10/2000*/
        double pretencaoSalarial=Double.parseDouble(JOptionPane.showInputDialog("Informe sua pretenção salarial: "));
        String grauInstrucao= JOptionPane.showInputDialog("Informe seu grau de instrução: ");
        String cargoPretendido= JOptionPane.showInputDialog("Informe seu cargo pretendido: "); /**Orientar o usuário o que ele deve informar aqui ex.: ensino médio completo */
        String possuiCnh= JOptionPane.showInputDialog("Você possui CNH tipo B?: "); /**Orientar o usuário o que ele deve informar aqui - S- para sim N-para não, por exemplo */

        JOptionPane.showMessageDialog(null,nome+""+sobrenome+"\n"+dataNascimento+"\n"+pretencaoSalarial+"\n"+grauInstrucao+"\n"+cargoPretendido+"\n"+possuiCnh);
    }
}

