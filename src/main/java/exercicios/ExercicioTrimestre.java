package exercicios;

public class ExercicioTrimestre {
    public static void main(String[] args){
        Integer gastosJaneiro = 15000;
        Integer gastosFevereiro = 23000;
        Integer gastosMarco = 17000;
        Integer gastosTrimestre;
        Integer mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco)/3;

        gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);

        System.out.println(gastosTrimestre);
        System.out.println("Valor da média mensal:" + mediaMensal);

    }
}
