package org.example.model;

public class Partida {
    private String codigoPartida;
    private String rodada;
    private String data;
    private String hora;
    private String mandante;
    private String visitante;
    private String formacao_mandante;
    private String formacao_visitante;
    private String tecnico_mandante;
    private String tecnico_visitante;
    private String vencedor;
    private String arena;
    private String mandante_Placar;
    private String visitante_Placar;
    private String mandante_Estado;
    private String visitante_Estado;

    public Partida(String[] linhaArquivo) {
        this.codigoPartida = linhaArquivo[0];
        this.rodada = linhaArquivo[1];
        this.data = linhaArquivo[2];
        this.hora = linhaArquivo[3];
        this.mandante = linhaArquivo[4];
        this.visitante = linhaArquivo[5];
        this.formacao_mandante = linhaArquivo[6];
        this.formacao_visitante = linhaArquivo[7];
        this.tecnico_mandante = linhaArquivo[8];
        this.tecnico_visitante = linhaArquivo[9];
        this.vencedor = linhaArquivo[10];
        this.arena = linhaArquivo[11];
        this.mandante_Placar = linhaArquivo[12];
        this.visitante_Placar = linhaArquivo[13];
        this.mandante_Estado = linhaArquivo[14];
        this.visitante_Estado = linhaArquivo[15];
    }

    public String getCodigoPartida() { return codigoPartida; }
    public void setCodigoPartida(String codigoPartida) { this.codigoPartida = codigoPartida; }
    public String getRodada() { return rodada; }
    public void setRodada(String rodada) { this.rodada = rodada;}
    public String getData() {return data; }
    public void setData(String data) { this.data = data; }
    public String getHora() {  return hora;}
    public void setHora(String hora) { this.hora = hora;}
    public String getMandante() { return mandante; }
    public void setMandante(String mandante) { this.mandante = mandante;}
    public String getVisitante() {return visitante;}
    public void setVisitante(String visitante) {this.visitante = visitante;    }
    public String getFormacao_mandante() { return formacao_mandante;}
    public void setFormacao_mandante(String formacao_mandante) {this.formacao_mandante = formacao_mandante; }
    public String getTecnico_mandante() {return tecnico_mandante;}
    public void setTecnico_mandante(String tecnico_mandante) {this.tecnico_mandante = tecnico_mandante; }
    public String getTecnico_visitante() {return tecnico_visitante; }
    public void setTecnico_visitante(String tecnico_visitante) { this.tecnico_visitante = tecnico_visitante; }
    public String getVencedor() {return vencedor; }
    public void setVencedor(String vencedor) { this.vencedor = vencedor; }
    public String getArena() {return arena; }
    public void setArena(String arena) { this.arena = arena; }
    public String getMandante_Placar() {return mandante_Placar; }
    public void setMandante_Placar(String mandante_Placar) { this.mandante_Placar = mandante_Placar; }
    public String getVisitante_Placar() {return visitante_Placar; }
    public void setVisitante_Placar(String visitante_Placar) { this.visitante_Placar = visitante_Placar; }
    public String getMandante_Estado() { return mandante_Estado; }
    public void setMandante_Estado(String mandante_Estado) {this.mandante_Estado = mandante_Estado; }
    public String getVisitante_Estado() { return visitante_Estado; }
    public void setVisitante_Estado(String visitante_Estado) { this.visitante_Estado = visitante_Estado; }
    public String getFormacao_visitante() {return formacao_visitante;}
    public void setFormacao_visitante(String formacao_visitante) {this.formacao_visitante = formacao_visitante;}
    @Override
    public String toString() {
        return "Partida{" +
                "codigoPartida='" + codigoPartida + '\'' +
                ", rodada='" + rodada + '\'' +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", mandante='" + mandante + '\'' +
                ", visitante='" + visitante + '\'' +
                ", formacao_mandante='" + formacao_mandante + '\'' +
                ", tecnico_mandante='" + tecnico_mandante + '\'' +
                ", tecnico_visitante='" + tecnico_visitante + '\'' +
                ", vencedor='" + vencedor + '\'' +
                ", arena='" + arena + '\'' +
                ", mandante_Placar='" + mandante_Placar + '\'' +
                ", visitante_Placar='" + visitante_Placar + '\'' +
                ", mandante_Estado='" + mandante_Estado + '\'' +
                ", visitante_Estado='" + visitante_Estado + '\'' +
                '}';
    }
}
