public class Principal {
    public static void main(String[] args) {

        Banco b = new Banco(); //Queremos só um objeto banco

        int opcao = 0;
        int agencia=0;
        int numero=0;
        Conta conta;

        do {
            opcao= EntradaSaida.escolherOpcaoMenu();
        switch (opcao) {
            case 1:
                Conta c = new Conta(); // um novo objeto conta a cada veza q abre o banco 
                c.agencia=EntradaSaida.solicitarDadoConta("a agência");
                c.numero=EntradaSaida.solicitarDadoConta("o número");
                Pessoa p = new Pessoa();
                p.cpf=EntradaSaida.solicitarCpf();
                p.dataNascimento=EntradaSaida.solicitarDadoTitular("a data de nascimento");
                p.nome=EntradaSaida.solicitarDadoTitular("o nome completo");
                c.titular=p; 
                b.adicionarConta(c); // adicionando o obj conta na lista do banco              
            break;

            case 2:
                if(!b.listaDeContas.isEmpty()){
                EntradaSaida.mostrarContas(b.listarContas());
                }else {
                EntradaSaida.mostrarAlerta("Nenhuma conta foi cadastrada até o momento");
                }
            break;

            case 3:
                agencia = EntradaSaida.solicitarDadoConta("a agência");
                numero = EntradaSaida.solicitarDadoConta("o número");

                conta = b.encontarConta(agencia, numero);
                if (conta!=null){
                conta.depositar(EntradaSaida.solicitarValorOperacao("depósito"));
                }else{
                    EntradaSaida.mostrarAlerta("A agência e número digitados não correspondem a nenhuma conta");
                } 
            break;

            case 4:
                 agencia = EntradaSaida.solicitarDadoConta("a agência");
                 numero = EntradaSaida.solicitarDadoConta("o número");
                conta = b.encontarConta(agencia, numero);
                if (conta!=null){
                conta.sacar(EntradaSaida.solicitarValorOperacao("saque"));
                }else{
                    EntradaSaida.mostrarAlerta("A agência e número digitados não correspondem a nenhuma conta");
                } 
            break;
 
            default:
        } 
        
            
        }while (opcao!=5); 
        
    }
}
