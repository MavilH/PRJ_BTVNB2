/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "gameController", urlPatterns = {"/random"})
public class gameController extends HttpServlet {

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String chooseStr = request.getParameter("choose");
        int choose = Integer.parseInt(chooseStr);
        ArrayList<Item> itemList = new ArrayList();
        itemList.add(new Item(1, "Rock"));
        itemList.add(new Item(2, "Paper"));
        itemList.add(new Item(3, "Scissors"));
        Random rand = new Random();
        Item randomObj = itemList.get(rand.nextInt(itemList.size()));
        
        // -2 và 1 là thắng
        // -1 và 2 là thua
        // 0 là hòa
        int result = choose - randomObj.getOrdinalNumber();
        String msg;
        if(result == -2 || result == 1){
            msg = "YOU WIN";
        }else if(result == -1 || result == 2){
            msg = "YOU LOSE";
        }else {
            msg = "DRAW";
        }
        request.setAttribute("item", randomObj.getName());
        request.setAttribute("message", msg);
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   

}
