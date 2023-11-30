
public class Validacao {
    public static boolean validarNota (double nota){
        boolean notaValida = false;
        if (nota >= 0 && nota <= 10) {
            notaValida = true;
        }
        return notaValida;
    }
}
