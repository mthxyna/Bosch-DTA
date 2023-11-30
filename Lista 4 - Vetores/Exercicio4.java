import javax.swing.JOptionPane;

public class Exercicio4 {
   public static void main(String[] args) {
      String[] disciplina = new String[4];
      String[] cargaHoraria = new String[4];
      String[] nomeProfessor = new String[4];
      
      for(int i=0; i < 4; i++){
         String inputDisciplina = JOptionPane.showInputDialog("-Informe o nome da disciplina " + (i + 1) + ": ");
         disciplina[i] = inputDisciplina;

         String inputCargaHoraria = JOptionPane.showInputDialog("- Informe a carga horária da disciplina " +disciplina[i]+ ":");
         cargaHoraria[i] = inputCargaHoraria;
      
         String inputProfessor = JOptionPane.showInputDialog("Informe o nome do professor da disciplina "+disciplina[i]+":");
         nomeProfessor[i] = inputProfessor;
    }

    String pesquisaDisciplina = JOptionPane.showInputDialog("Informe o nome da disciplina que deseja ver as descrições");

    boolean disciplinaEncontrada = false;
    for (int i = 0; i<4; i++) {
      if (disciplina[i].equalsIgnoreCase(pesquisaDisciplina)) {
         disciplinaEncontrada = true;
         JOptionPane.showMessageDialog(null, "Disciplina: "+disciplina[i]+"\nCarga horária: "+cargaHoraria[i]+"\nProfessor: "+nomeProfessor[i]);
         break;
      }
    }

    if (!disciplinaEncontrada) {
      JOptionPane.showMessageDialog(null,"Disciplina não encontrada");
    }

   } 
}
