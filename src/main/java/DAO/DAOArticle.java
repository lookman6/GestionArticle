/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITES.Article;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;


/**
 *
 * @author dell
 */
public class DAOArticle {
    
    private static Session session;
    private static Transaction transaction;
    
    public static void create(Article article)
    {
        session =HibernateUtil.getSessionFactory().openSession();
         
        transaction = session.beginTransaction();
        session.save(article);
        transaction.commit();
       
      
    }
    
    public static void update(Article article)
    {
        session =HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Article a = session.load(Article.class,article.getCode());
         a.setDesignation(article.getDesignation());
        a.setPrix(article.getPrix());
        session.update(a);
        transaction.commit();
       
    }
    
    public static List<Article> getAll()
    {
        session =HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Article> articles = new ArrayList<Article>();
        try
        {
            articles = session.createQuery("from Article").list();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return articles;
    }
    
}
