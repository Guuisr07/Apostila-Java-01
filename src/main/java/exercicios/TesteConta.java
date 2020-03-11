package exercicios;

public class TesteConta {
    public static void main(String[] args) {
        //criando uma nova conta
        Conta c1 = new Conta();
        c1.setNome("Guilherme");
        c1.agencia = "4567-7";
        c1.numero = 564;

        Conta c2 = new Conta();
        c2.setNome("Guilherme");

        Data d1 = new Data();
        c1.dataDeAbertura = d1;
        d1.dia = 02;
        d1.mes = 04;
        d1.ano = 2020;

        c1.deposita(-30);
        System.out.println("Saldo:" + c1.pegaSaldo());

        if( c1 == c2 ){
            System.out.println("Dados iguais das contas");
        } else {
            System.out.println("Dados diferentes das contas");
        }

        System.out.println(c1.recuperarDadosParaImpressao());
    }


}
