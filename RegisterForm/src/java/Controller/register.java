/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author ADMIN
 */
@WebServlet(name = "register", urlPatterns = {"/process"})
public class register extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullname = request.getParameter("fullname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        
        if(fullname.isEmpty() || username.isEmpty() || password.isEmpty() || email.isEmpty()){
            String errorMSG = "PLS Fill All Fields of Form";
            request.setAttribute("message", errorMSG);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else{
            User u = new User(fullname, username, password, email);
            request.setAttribute("user", u);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
    }

}
