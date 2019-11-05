/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

@WebServlet(urlPatterns="/register")
public class Cadastrar extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        
        try{
            req.setCharacterEncoding("UTF-8"); 
        }catch(Exception e){}
        
        ServletContext sc = req.getServletContext();
        try {
            sc.getRequestDispatcher("/jsp/cadastrar.jsp").forward(req, resp); 
        }catch(Exception e){
                //Tratamento de erro de IO ou de Servlet..
        }                       
    }
}