package exemplos;

public class TestaAlgunsMetodos {
    public static void main(String[] args) {
        //Criando a conta
        /*Conta minhaConta;
        minhaConta = new Conta();

        //Alterando valores da conta
        minhaConta.titular = "Guilherme";
        minhaConta.saldo = 1000.0;

        //Saca 200
        minhaConta.saca( 200);

        //Deposita 200
        minhaConta.deposita(500);
        System.out.println(minhaConta.saldo);*/

        //Criando um cliente
        Conta minhaConta = new Conta();
        Cliente c = new Cliente();
        minhaConta.titular = c;
        System.out.println(c);
    }
}
