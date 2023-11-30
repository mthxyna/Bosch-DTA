public class Principal {
    public static void main(String[] args) {

        Double pergunta = EntradaSaida.pedirSalario("");
        boolean salarioValido = Validacao.validarSalario(pergunta);

        while (salarioValido == false) {
            pergunta = EntradaSaida.pedirSalario("O salário não pode ser menor que R$500,00 e maior que R$3000,00!");
            salarioValido = Validacao.validarSalario(pergunta);
        }

        int extras = EntradaSaida.pedirHorasExtras();
        double descontoaInss = Calculo.calcularDescInss(pergunta);
        double descontoIrpf = Calculo.calcularIrpf(pergunta);
        double descontoPlano = Calculo.calcularDescPlano(pergunta);
        double acrescimoHoraExtra = Calculo.calcularHoraExtra(pergunta, extras);
        double salarioLiquido = Calculo.calcularSalarioLiq(pergunta, descontoaInss, descontoIrpf, descontoPlano, acrescimoHoraExtra);

        EntradaSaida.mostrarSalario(salarioLiquido);
    }
}
