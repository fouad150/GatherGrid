package com.example.gathergridproject;

import java.io.*;

import com.example.gathergridproject.domain.Evenement;
import com.example.gathergridproject.domain.Utilisateur;
import com.example.gathergridproject.repository.UserRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;


    @Override
    public void init() throws ServletException {
        super.init();
        UserRepository eventService = new UserRepository();
        /*Utilisateur userTest = new Utilisateur("houdda" , "fouad","fouad@gmail.com", new Evenement());
        eventService.save(userTest);*/

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}