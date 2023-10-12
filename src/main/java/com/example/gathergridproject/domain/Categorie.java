package com.example.gathergridproject.domain;

import jakarta.persistence.*;

@Entity
@Table(name="categories")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private String description;

    public Categorie() {
    }

    public Categorie(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
