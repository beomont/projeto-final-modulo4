package org.example.model;

public class Gol {
    private Integer idPartida;
    private Integer rodada;
    private String clube;
    private String atleta;
    private String minutoPartida;
    private String tipoGol;

    public Gol(Integer idPartida, Integer rodada, String clube, String atleta, String minutoPartida, String tipoGol) {
        this.idPartida = idPartida;
        this.rodada = rodada;
        this.clube = clube;
        this.atleta = atleta;
        this.minutoPartida = minutoPartida;
        this.tipoGol = tipoGol;
    }

    public Gol(Integer idPartida, Integer rodada, String clube, String atleta, String minutoPartida) {
        this.idPartida = idPartida;
        this.rodada = rodada;
        this.clube = clube;
        this.atleta = atleta;
        this.minutoPartida = minutoPartida;
    }

    public Integer getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(Integer idPartida) {
        this.idPartida = idPartida;
    }

    public Integer getRodada() {
        return rodada;
    }

    public void setRodada(Integer rodada) {
        this.rodada = rodada;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getAtleta() {
        return atleta;
    }

    public void setAtleta(String atleta) {
        this.atleta = atleta;
    }

    public String getMinutoPartida() {
        return minutoPartida;
    }

    public void setMinutoPartida(String minutoPartida) {
        this.minutoPartida = minutoPartida;
    }

    public String getTipoGol() {
        return tipoGol;
    }

    public void setTipoGol(String tipoGol) {
        this.tipoGol = tipoGol;
    }

}
