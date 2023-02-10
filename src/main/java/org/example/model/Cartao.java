package org.example.model;

public class Cartao {

    private String partidaId;
    private String rodada;
    private String clube;
    private String cartao;
    private String atleta;
    private String num_camisa;
    private String posicao;
    private String minuto;

    public static final String TIPO_CARTAO_AMARELO = "Amarelo";
    public static final String TIPO_CARTAO_VERMELHO = "Vermelho";

    public Cartao(String[] linhaArquivo) {
        this.partidaId = linhaArquivo[0];
        this.rodada = linhaArquivo[1];
        this.clube = linhaArquivo[2];
        this.cartao = linhaArquivo[3];
        this.atleta = linhaArquivo[4];
        this.num_camisa = linhaArquivo[5];
        this.posicao = linhaArquivo[6];
        this.minuto = linhaArquivo[7];
    }

    public String getPartidaId() {
        return partidaId;
    }

    public void setPartidaId(String partidaId) {
        this.partidaId = partidaId;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getAtleta() {
        return atleta;
    }

    public void setAtleta(String atleta) {
        this.atleta = atleta;
    }

    public String getNum_camisa() {
        return num_camisa;
    }

    public void setNum_camisa(String num_camisa) {
        this.num_camisa = num_camisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }
}
