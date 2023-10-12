package com.example.gathergridproject;

import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/init",loadOnStartup = 1)
public class initDb extends HttpServlet {
    @Override
    public void init(){
        Persistence.createEntityManagerFactory("my-persistence-unit");
    }
}
