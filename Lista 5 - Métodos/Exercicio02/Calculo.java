public class Calculo {
    public static double calcularDescInss (double pedirSalario){
        return pedirSalario*0.2;
    }

    public static double calcularIrpf (double pedirSalario){
        return pedirSalario*0.1;
    }

    public static double calcularDescPlano (double pedirSalario){
        return pedirSalario*0.05;
    }

    public static double calcularHoraExtra (double pedirSalario, int horasExtras){
        double valorHora = pedirSalario/160;
        double valorHoraExtra = (valorHora*0.5)+valorHora;
        return horasExtras*valorHoraExtra;
    }

    public static double calcularSalarioLiq (double pedirSalario, double calcularDescInss, double calcularIrpf, double calcularDescPlano, double acrescimoExtra){
        return (pedirSalario+acrescimoExtra)-calcularDescInss-calcularIrpf-calcularDescPlano;
    }
}
