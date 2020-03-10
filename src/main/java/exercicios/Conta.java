package exercicios;

public class Conta {
    String nome;
    String agencia;
    int numero;
    double saldo;
    double rendimento;
    Data dataDeAbertura;

    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;

    }

    void deposita(double quantidade){
        this.saldo += quantidade;
    }

    void calculaRendimento(){
       this.rendimento = saldo * 0.1;
    }

    String recuperarDadosParaImpressao(){
        String dados = "Titular: " + this.nome;
        dados += "\nNumero: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSaldo da conta: " + this.saldo;
        dados += "\n----- Data de Abertura da conta -----\n\t\t";
        dados += this.dataDeAbertura.formatada();
        return dados;
    }
}



