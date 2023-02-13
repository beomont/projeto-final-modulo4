package org.example.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class PartidaComMaisGols {
    private Integer id;
    private Integer rodada;
    private LocalDate data;
    private LocalTime hora;
    private String mandante;
    private String visitante;
    private String vencedor;
    private String arena;
    private Integer mandantePlacar;
    private Integer visitantePlacar;
    private String mandanteEstado;
    private String visitanteEstado;


    public PartidaComMaisGols(Integer id, Integer rodada, LocalDate data, String mandante, String visitante, String arena, Integer mandantePlacar, Integer visitantePlacar, String mandanteEstado, String visitanteEstado) {
        this.id = id;
        this.rodada = rodada;
        this.data = data;
        this.mandante = mandante;
        this.visitante = visitante;
        this.vencedor = vencedor;
        this.arena = arena;
        this.mandantePlacar = mandantePlacar;
        this.visitantePlacar = visitantePlacar;
        this.mandanteEstado = mandanteEstado;
        this.visitanteEstado = visitanteEstado;
    }

    public Integer getId() {
        return id;
    }

    public Integer getRodada() {
        return rodada;
    }

    public LocalDate getData() {
        return data;
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

    public String getArena() {
        return arena;
    }

    public Integer getMandantePlacar() {
        return mandantePlacar;
    }

    public Integer getVisitantePlacar() {
        return visitantePlacar;
    }

    public String getMandanteEstado() {
        return mandanteEstado;
    }

    public String getVisitanteEstado() {
        return visitanteEstado;
    }

    @Override
    public String toString() {
        return "PartidaComMaisGols{" +
                "id=" + id +
                ", rodada=" + rodada +
                ", data=" + data +
                ", hora=" + hora +
                ", mandante='" + mandante + '\'' +
                ", visitante='" + visitante + '\'' +
                ", vencedor='" + vencedor + '\'' +
                ", arena='" + arena + '\'' +
                ", mandantePlacar=" + mandantePlacar +
                ", visitantePlacar=" + visitantePlacar +
                ", mandanteEstado='" + mandanteEstado + '\'' +
                ", visitanteEstado='" + visitanteEstado + '\'' +
                '}';
    }
}
