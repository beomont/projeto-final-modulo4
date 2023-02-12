package org.example;

import org.example.controller.CartoesCampeonato;
import org.example.controller.EstadoJogos;
import org.example.controller.TimeComMaisVitorias2008;
import org.example.view.GolsCampeonatoView;
import org.example.view.MaiorPlacarGols;
import org.example.view.MaiorVencedor2008;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        MaiorVencedor2008.imprimirDadosTimeQueMaisVenceu();

        GolsCampeonatoView.imprimeGolsAtleta();
        CartoesCampeonato.mostrarJogadoresComMaisCartoes();
        MaiorPlacarGols maiorPlacarGols = new MaiorPlacarGols();
        maiorPlacarGols.imprimirDados();
        EstadoJogos EstadoJogos = null;
        EstadoJogos.mapaEstadoPartida();





    }

}