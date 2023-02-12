package org.example.model;

import java.time.LocalDate;

public class TimesQueMaisVenceu2008 {
    private Integer id;
    private Integer rodada;
    private LocalDate data;
    private String mandante;
    private String visitante;
    private String vencedor;


    public TimesQueMaisVenceu2008(Integer id, Integer rodada, LocalDate data, String mandante, String visitante, String vencedor) {
        this.id = id;
        this.rodada = rodada;
        this.data = data;
        this.mandante = mandante;
        this.visitante = visitante;
        this.vencedor = vencedor;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public Integer getRodada() {
        return rodada;
    }

    public String getMandante() {
        return mandante;
    }

    public String getVisitante() {
        return visitante;
    }


    public String getVencedor() {
        return vencedor;
    }

    @Override
    public String toString() {
        return "TimesQueMaisVenceu2008{" +
                "id=" + id +
                ", rodada=" + rodada +
                ", data=" + data +
                ", mandante='" + mandante + '\'' +
                ", visitante='" + visitante + '\'' +
                ", vencedor='" + vencedor + '\'' +
                '}';
    }
}