package com.example.gathergridproject.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "utilisateurs")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @ManyToOne
    private Evenement evenement;

    public Utilisateur() {
    }

    public Utilisateur(String nom , String prenom,String email,Evenement evenement) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.evenement=evenement;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }
}
