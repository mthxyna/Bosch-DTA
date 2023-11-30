public class Principal {
    public static void main(String[] args) {
        final int PRAZO = 24;
        final double TAXA_ACRESCIMO = 0.35;

        double salario = EntradaSaida.pedirSalario("");
        boolean salarioValido = Validacao.validarSalario(salario);
        while (salarioValido == false) {  
            salario = EntradaSaida.pedirSalario("O salário não pode ser negativo ou nulo! ");
            salarioValido = Validacao.validarSalario(salario);
        }
        
        double valorEmprestado = EntradaSaida.pedirValorEmprestado("");
        boolean valorValido = Validacao.validarValorEmprestado(valorEmprestado);
        while (valorValido == false) {
            if (valorEmprestado < 0) {
                valorEmprestado = EntradaSaida.pedirValorEmprestado("O valor informado não pode ser negativo ou nulo! ");
                valorValido = Validacao.validarValorEmprestado(valorEmprestado);
            } else {
                valorEmprestado = EntradaSaida.pedirValorEmprestado("O valor informado é muito alto!");
                valorValido = Validacao.validarValorEmprestado(valorEmprestado);
            }
            
        }
        
        double valorTotalEmprestimo = Calculo.calcularValorEmprestimo(valorEmprestado, TAXA_ACRESCIMO);

        double valorParcela = Calculo.calcularValorParcela(valorTotalEmprestimo, PRAZO);
        boolean emprestimoValido = Validacao.validarEmprestimoPossivel(salario, valorParcela);

        if (emprestimoValido == true) {
            EntradaSaida.mostrarValores(valorTotalEmprestimo, valorParcela);
        } else { 
            EntradaSaida.mostrarMensagem();
        }
    }
}