package com.apiandroid.Entities;

public class Alumno {

    private int alumneId;
    private int grupId;
    private String grupNom;
    private String nom;
    private String cognoms;
    private String email;

    public int getAlumneId() {
        return alumneId;
    }

    public void setAlumneId(int alumneId) {
        this.alumneId = alumneId;
    }

    public int getGrupId() {
        return grupId;
    }

    public void setGrupId(int grupId) {
        this.grupId = grupId;
    }

    public String getGrupNom() {
        return grupNom;
    }

    public void setGrupNom(String grupNom) {
        this.grupNom = grupNom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Grupo ID: ").append(grupId)
                .append("\nAlumne ID: ").append(alumneId)
                .append("\nGrup Nom: ").append(grupNom)
                .append("\nNom: ").append(nom)
                .append("\nCognoms: ").append(cognoms)
                .append("\nEmail: ").append(email)
                .append("\n\n");
        return stringBuilder.toString();
    }
}
