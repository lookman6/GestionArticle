/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestionarticle;

import DAO.DAOArticle;
import ENTITES.Article;
import java.util.List;

/**
 *
 * @author dell
 */
public class GestionArticle {

    public static void main(String[] args) {
        Article article = new Article();
        /*article.setCode("IPH2");
        article.setDesignation("IPHONE 17");
        article.setPrix(148722.5);
        DAOArticle.create(article);*/
        List<Article> articles = DAOArticle.getAll();
        for(Article art : articles)
        {
            System.out.println(art.getDesignation()+"-->"+art.getPrix());
        }
        
        
       /* article.setCode("IPH2");
        article.setDesignation("IPHONE 17 Pro Max");
        article.setPrix(348722.5);
        DAOArticle.update(article);
        
        for(Article art : articles)
        {
            System.out.println(art.getDesignation()+"-->"+art.getPrix());
        }*/
    }
}
