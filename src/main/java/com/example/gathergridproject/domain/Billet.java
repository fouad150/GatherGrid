package com.example.gathergridproject.domain;

import jakarta.persistence.*;

@Entity
@Table(name="billets")
public class Billet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private float prix;
    private int quantityDisponible;
    private String typeBillet;
    @ManyToOne
    private Evenement evenement;
    @ManyToOne
    private Utilisateur ustilisateur;

    public Billet() {
    }

    public Billet(float prix, int quantityDisponible, String typeBillet, Evenement evenement, Utilisateur ustilisateur) {
        this.prix = prix;
        this.quantityDisponible = quantityDisponible;
        this.typeBillet = typeBillet;
        this.evenement = evenement;
        this.ustilisateur = ustilisateur;
    }

    public long getId() {
        return id;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getQuantityDisponible() {
        return quantityDisponible;
    }

    public void setQuantityDisponible(int quantityDisponible) {
        this.quantityDisponible = quantityDisponible;
    }

    public String getTypeBillet() {
        return typeBillet;
    }

    public void setTypeBillet(String typeBillet) {
        this.typeBillet = typeBillet;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }

    public Utilisateur getUstilisateur() {
        return ustilisateur;
    }

    public void setUstilisateur(Utilisateur ustilisateur) {
        this.ustilisateur = ustilisateur;
    }
}
