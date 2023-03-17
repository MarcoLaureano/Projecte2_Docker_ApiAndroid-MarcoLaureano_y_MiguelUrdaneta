package com.apiandroid.Entities;

public class Grupo {
    private String grup;
    private int curs;
    private String cicle;
    private String aula;
    private int grupId;

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getGrupId() {
        return grupId;
    }

    public void setGrupId(int grupId) {
        this.grupId = grupId;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Grupo ID: ").append(grupId)
                .append("\nGrup Nom: ").append(grup)
                .append("\nCicle: ").append(cicle)
                .append("\nCurs: ").append(curs)
                .append("\nAula: ").append(aula)
                .append("\n\n");
        return stringBuilder.toString();
    }
}
