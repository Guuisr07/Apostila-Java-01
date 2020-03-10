package exercicios;

public class TesteConta {
    public static void main(String[] args) {
        //criando uma nova conta
        Conta c1 = new Conta();
        c1.nome = "Guilherme";
        c1.saldo = 200;
        c1.agencia = "4567-7";
        c1.numero = 564;

        Conta c2 = new Conta();
        c2.nome = "Guilherme";
        c2.saldo = 200;

        Data d1 = new Data();
        c1.dataDeAbertura = d1;
        d1.dia = 02;
        d1.mes = 04;
        d1.ano = 2020;


        if( c1 == c2 ){
            System.out.println("Dados iguais das contas");
        } else {
            System.out.println("Dados diferentes das contas");
        }

        System.out.println(c1.recuperarDadosParaImpressao());
    }


}
