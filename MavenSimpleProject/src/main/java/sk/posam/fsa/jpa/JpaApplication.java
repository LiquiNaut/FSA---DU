package sk.posam.fsa.jpa;

import sk.posam.fsa.jpa.domain.Category;
import sk.posam.fsa.jpa.domain.Film;
import sk.posam.fsa.jpa.domain.FilmCategory;

import javax.persistence.*;
import java.util.List;


public class JpaApplication {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dvdrental-pu-name");
        EntityManager em = factory.createEntityManager();

        // zaznamy z tabulky Category
        Query categoryQuery = em.createQuery("select c from Category c");
        List<Category> categories = categoryQuery.getResultList();
        for (Category category : categories) {
            System.out.println(category);
        }
        System.out.println("Pocet kategorii: " + categories.size());

        // zaznamy z tabulky Film
        Query filmQuery = em.createQuery("select f from Film f");
        List<Film> films = filmQuery.getResultList();
        for (Film film : films) {
            System.out.println(film);
        }
        System.out.println("Pocet filmov: " + films.size());

        // zaznamy z tabulky FilmCategory
        Query filmCategoryQuery = em.createQuery("select fc from FilmCategory fc");
        List<FilmCategory> filmCategories = filmCategoryQuery.getResultList();
        for (FilmCategory filmCategory : filmCategories) {
            System.out.println(filmCategory);
        }
        System.out.println("Pocet filmovych kategorii: " + filmCategories.size());

        em.close();
    }
}