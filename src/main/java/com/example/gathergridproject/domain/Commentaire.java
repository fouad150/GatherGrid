package com.example.gathergridproject.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "commentaires")
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String texteDuCommentaire;
    private String evaluation;
    @ManyToOne
    private Utilisateur utilisatuer;
    @ManyToOne
    private Evenement evenement;

    public Commentaire() {
    }

    public Commentaire(String texteDuCommentaire, String evaluation, Utilisateur utilisatuer, Evenement evenement) {
        this.texteDuCommentaire = texteDuCommentaire;
        this.evaluation = evaluation;
        this.utilisatuer = utilisatuer;
        this.evenement = evenement;
    }

    public long getId() {
        return id;
    }

    public String getTexteDuCommentaire() {
        return texteDuCommentaire;
    }

    public void setTexteDuCommentaire(String texteDuCommentaire) {
        this.texteDuCommentaire = texteDuCommentaire;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public Utilisateur getUtilisatuer() {
        return utilisatuer;
    }

    public void setUtilisatuer(Utilisateur utilisatuer) {
        this.utilisatuer = utilisatuer;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }
}
