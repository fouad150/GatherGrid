package com.example.gathergridproject.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "evenements")
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

    private String date;

    private String heure;

    private String lieu;

    private String description;

    private String organisateur;

    @ManyToOne
    private Categorie categorie;

    public Evenement() {
    }

    public Evenement(String nom, String date, String heure, String lieu, String description, String organisateur, Categorie categorie) {
        this.nom = nom;
        this.date = date;
        this.heure = heure;
        this.lieu = lieu;
        this.description = description;
        this.organisateur = organisateur;
        this.categorie = categorie;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(String organisateur) {
        this.organisateur = organisateur;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
