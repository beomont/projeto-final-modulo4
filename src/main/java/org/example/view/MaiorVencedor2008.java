package org.example.view;


import org.example.controller.TimeComMaisVitorias2008;

import java.io.IOException;
import java.util.Map;

public class MaiorVencedor2008 {
    private static TimeComMaisVitorias2008 timeComMaisVitorias2008 = new TimeComMaisVitorias2008();

    private static int numero;
    public MaiorVencedor2008() {
        if(timeComMaisVitorias2008 == null){
            timeComMaisVitorias2008 = new TimeComMaisVitorias2008();
        }
    }

    public static void imprimirDadosTimeQueMaisVenceu() throws IOException {

        Map<String, Long> timeMaisVencedorEm2008 = timeComMaisVitorias2008.PegaTimeQueMaisVenceu(2008);
        Long numeroDeVitorias = timeMaisVencedorEm2008.get(timeMaisVencedorEm2008.keySet().iterator().next());

        System.out.print("☑ ");
        System.out.println("Os times que mais venceram jogos em 2008 (Time | Vitórias):");
        for (Map.Entry<String, Long> entry : timeMaisVencedorEm2008.entrySet()) {
            if (numeroDeVitorias.equals(entry.getValue())) {
                System.out.println("\t" + entry.getKey() + " | " + entry.getValue());
            }
        }
    }
}

