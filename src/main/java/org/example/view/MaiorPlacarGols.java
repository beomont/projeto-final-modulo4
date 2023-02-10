package org.example.view;

import org.example.controll.PartidaGols;

import java.io.IOException;
import java.util.List;

public class MaiorPlacarGols {
    private static PartidaGols partidaGols;

    public MaiorPlacarGols() {
        if(partidaGols == null) {
            partidaGols = new PartidaGols();
        }
    }

    public static void imprimirDados() throws IOException {

        //ConsoleUIHelper.drawHeader("ESTATÍSTICAS - TIMES | ESTADOS | OUTROS:", 80);



        imprimirMaiorPlacar();

    }

    // MUDAR AQUI
    public static void imprimirMaiorPlacar() throws  IOException{
        PartidaGols partidaGols = new PartidaGols();

        List<String> partidaComMaiorPlacar = partidaGols.PegaMaiorPlacar();

        System.out.println("O Placar da partida com mais gols foi (Time Mandante | Placar Mandante X Placar Visitante | Time Visitante):");
        for(String placar: partidaComMaiorPlacar){
            System.out.println("\t" + placar);
        }

    }

}
