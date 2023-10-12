package com.example.gathergridproject.repository;

import com.example.gathergridproject.domain.Utilisateur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class UserRepository {
    private final EntityManagerFactory entityManagerFactory;

    public UserRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    public void save(Utilisateur user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Utilisateur findById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Utilisateur user = entityManager.find(Utilisateur.class, id);
        entityManager.close();
        return user;
    }

    public List<Utilisateur> getAllUsers() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Utilisateur> users = entityManager.createQuery("SELECT u FROM Utilisateur u", Utilisateur.class).getResultList();
        entityManager.close();
        return users;
    }

    public void update(Long userId, Utilisateur updatedUser) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Utilisateur user = entityManager.find(Utilisateur.class, userId); // Retrieve the user entity by ID
        if (user != null) {
            // Update the properties of the user entity with the values from the updatedUser object
            user.setNom(updatedUser.getNom());
            user.setEmail(updatedUser.getEmail());

            entityManager.merge(user);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void delete(Long userId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Utilisateur user = entityManager.find(Utilisateur.class, userId); // Retrieve the user entity by ID
        if (user != null) {
            entityManager.remove(user);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}