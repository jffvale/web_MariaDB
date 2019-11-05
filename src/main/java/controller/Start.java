/*
Perceber que no redirecionamento da resposta diretórios devem
ser iniciados por "/"
 */
package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

@WebServlet(urlPatterns="")
public class Start extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){

        try{
            req.setCharacterEncoding("UTF-8"); 
        }catch(Exception e){}
        
        ServletContext sc = req.getServletContext();
        try{
        sc.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);            
        } catch (Exception e){}
    }
}
