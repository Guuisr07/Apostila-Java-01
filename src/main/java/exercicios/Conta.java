package exercicios;

public class Conta {
    private String nome;
    String agencia;
    int numero;
    private double saldo;
    double rendimento;
    Data dataDeAbertura;
    String titular;

    //Criando o construtor
    Conta(){
        System.out.println("-|Construindo uma conta|-");
    }

    /*Construtor com o titular da conta
    Conta(String titular){
        this.titular = titular;
    }*/

    //Setando valores nos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void saca(double quantidade){
        if( quantidade > this.saldo){
            System.out.println("Nao é possivel fazer a operacao, o valor solicitado e maior que o saldo disponivel");
        } else {
            this.saldo = this.saldo - quantidade;
            System.out.println("Saque efetuado com sucesso . SALDO:" + this.saldo);
        }

    }

    public void deposita(double quantidade){
        if(quantidade < 0){
            System.out.println("Nao e possivel fazer o deposito");
        } else {
            this.saldo += quantidade;
        }
    }

    public double pegaSaldo(){
        return this.saldo;
    }

    void calculaRendimento(){
       this.rendimento = saldo * 0.1;
    }

   public  String recuperarDadosParaImpressao(){
        String dados = "Titular: " + this.nome;
        dados += "\nNumero: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSaldo da conta: " + this.saldo;
        dados += "\n----- Data de Abertura da conta -----\n\t\t";
        dados += this.dataDeAbertura.formatada();
        return dados;
    }
}




