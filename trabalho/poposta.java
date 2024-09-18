package trabalho;
import java.util.concurrent.ThreadLocalRandom;
public class poposta {
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
     }



    public static void main(String[] args) {

        String[] candidatos = {"Luna Pereira ","Mateus Almeida","Clara Rodrigues","Lucas Ferreir","Isabela Martins","Gabriel Costa","Sophia Silva"};
        final double valoBa = 2000;
        String[] contP = new String[2] ;
        String[] paraEspera = new  String[2];
        String[] aProvados = new  String[5];


            for (int i = 0; i < candidatos.length; i++){
               if (valoBa > valorPretendido()){
                   System.out.println("lugar para o candidato");
                   aProvados[i] = candidatos[i];
           }
               else if(valoBa == valorPretendido()){
                   System.out.println("Ligar Para O Candidato, Com Contra Proposta");
                   contP[i] = candidatos[i];
               }
               else{
                   System.out.println("Aguardando Resultados Dos Demais Candidatos");
                   paraEspera[i] = candidatos[i];
               }
        }





    }



}
