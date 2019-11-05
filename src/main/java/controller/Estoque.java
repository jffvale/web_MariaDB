package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import model.Mercadoria;

@WebServlet(urlPatterns="/stock")
public class Estoque extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException{
        try{
            req.setCharacterEncoding("UTF-8"); 
        }catch(Exception e){}

        try{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");     
            EntityManager em = emf.createEntityManager();

/*           Criação de uma entidade - CREATE */

            /*
            Mercadoria m0 = new Mercadoria();
            m0.setId(10);
            m0.setNome("Arroz");
            m0.setMarca("Fantastico");
            m0.setUn_emb("pacote");
            m0.setQtde_unit(5);
            m0.setQtde_estoque(10);
            m0.setUn_medida("Kg");
            m0.setPreco_unit(8.7);
            em.getTransaction().begin();
            em.persist(m0);
            em.getTransaction().commit();
            */
            
            /* Criação de uma entidade - CREATE */

            /*
            Mercadoria m0 = new Mercadoria();
            m0.setId(20);
            m0.setNome("Macarrao parafuso");
            m0.setMarca("Adria");
            m0.setUn_emb("pacote");
            m0.setQtde_unit(0.5);
            m0.setQtde_estoque(15);
            m0.setUn_medida("Kg");
            m0.setPreco_unit(2.5);
            em.getTransaction().begin();
            em.persist(m0);
            em.getTransaction().commit();
            */

            /* Criação de uma entidade - CREATE */

            /*
            Mercadoria m0 = new Mercadoria();
            m0.setId(30);
            m0.setNome("Arroz ");
            m0.setMarca("Saboroso");
            m0.setUn_emb("pacote");
            m0.setQtde_unit(5);
            m0.setQtde_estoque(25);
            m0.setUn_medida("Kg");
            m0.setPreco_unit(6.3);
            em.getTransaction().begin();
            em.persist(m0);
            em.getTransaction().commit();
*/   

        /* Utilizando JPQL*/
        Query query = em.createQuery("SELECT m FROM mercadoria m "); // WHERE m.nome='Macarrão' ");
        List<Mercadoria> Mercadorias = query.getResultList();
        System.out.println("Resultados: ");
        for(Mercadoria mi: Mercadorias){
            System.out.println("Nome: " + mi.getNome() + "  Id: " + mi.getId() +
                 "  Unid/embalagem: " + mi.getUn_emb() + "  Qtde/Unid: " +
                  mi.getQtde_unit() + mi.getUn_medida() + "  Preço Unitário: R$" +
                  mi.getPreco_unit());
        }


        /*Query query = em.createQuery("SELECT * FROM mercadoria *");
        List<Mercadoria> mercadoria = query.getResultList();
*/
        em.close();
        emf.close();
        req.setAttribute("mercadoria", Mercadorias);

        ServletContext sc = req.getServletContext();
        try {
            sc.getRequestDispatcher("/jsp/estoque.jsp").forward(req, resp); 
        }catch(Exception e){}    

        }catch(Exception e){
            System.out.println("Erro em 10 ou Servlet!\n" + e.toString());
        }                       
    }
}