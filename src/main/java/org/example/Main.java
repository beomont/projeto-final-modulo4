package org.example;

import org.example.controller.CartoesCampeonato;
import org.example.view.GolsCampeonatoView;
import org.example.view.MaiorPlacarGols;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MaiorPlacarGols maiorPlacarGols = new MaiorPlacarGols();
        maiorPlacarGols.imprimirDados();
        CartoesCampeonato.mostrarJogadoresComMaisCartoes();
        GolsCampeonatoView.imprimeGolsAtleta();




    }

}