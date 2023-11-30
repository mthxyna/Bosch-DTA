public class Validacao {

    public static boolean validarSalario (double pedirSalario) {
        boolean salarioValido = false;

        if (pedirSalario >=500 && pedirSalario>3000) {
            salarioValido = true;
        }
        return salarioValido;
    }
}
