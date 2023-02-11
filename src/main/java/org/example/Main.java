package org.example;

import org.example.controller.CartoesCampeonato;
import org.example.view.GolsCampeonatoView;
import org.example.view.MaiorPlacarGols;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GolsCampeonatoView.imprimeGolsAtleta();
        CartoesCampeonato.mostrarJogadoresComMaisCartoes();
        MaiorPlacarGols maiorPlacarGols = new MaiorPlacarGols();
        maiorPlacarGols.imprimirDados();




    }

}