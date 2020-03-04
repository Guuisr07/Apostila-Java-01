package exemplos;

public class Conta {
    int numero;
    String titular;
    double saldo;

    //Criando um metodo
    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    void deposita(double quantidade){
        this.saldo += quantidade;
    }
}
