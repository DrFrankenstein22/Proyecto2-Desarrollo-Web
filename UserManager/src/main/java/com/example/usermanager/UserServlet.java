package com.example.usermanager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    private List<String> users = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        // Inicializar algunos usuarios
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("users", users);
        request.getRequestDispatcher("users.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newUser = request.getParameter("user");
        if (newUser != null && !newUser.trim().isEmpty()) {
            users.add(newUser);
        }
        response.sendRedirect("users");
    }
}
