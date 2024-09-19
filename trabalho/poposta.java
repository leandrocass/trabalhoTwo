package trabalho;

import java.util.concurrent.ThreadLocalRandom;

 class Proposta {

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void main(String[] args) {
        String[] candidatos = {
                "Luna Pereira", "Mateus Almeida", "Clara Rodrigues",
                "Lucas Ferreira", "Isabela Martins", "Gabriel Costa", "Sophia Silva"
        };
        final double valoBa = 2000;

        String[] contP = new String[candidatos.length];
        String[] paraEspera = new String[candidatos.length];
        String[] aProvados = new String[candidatos.length];
        int aprovadosCount = 0;

        for (String candidato : candidatos) {
            double pretendido = valorPretendido();
            if (valoBa > pretendido) {
                System.out.println("Ligar para o candidato " + candidato);
                aProvados[aprovadosCount++] = candidato;
            } else if (valoBa == pretendido) {
                System.out.println("Ligar para o candidato " + candidato + ", com contra proposta");
                contP[aprovadosCount] = candidato;
            } else {
                System.out.println("Aguardando resultados dos demais candidatos");
                paraEspera[aprovadosCount] = candidato;
            }
        }

        System.out.println("Candidatos Selecionados:");
        for (int i = 0; i < aprovadosCount; i++) {
            System.out.println(aProvados[i]);
            int tentativas = 0;
            boolean contato = false;

            while (tentativas < 3 && !contato) {
                tentativas++;
                contato = ThreadLocalRandom.current().nextBoolean();
                if (contato) {
                    System.out.println("CONSEGUIMOS CONTATO COM " + aProvados[i] + " APÓS " + tentativas + " TENTATIVA(S)");
                }
            }
            if (!contato) {
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + aProvados[i]);
            }
        }
    }
}











