package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.services.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Bean lié à la page peopleDetails.xhtml, qui permet d'afficher les détails
 * d'un client
 */
@Named(value = "personDetails")
@SessionScoped
public class PeopleDetailsBean implements Serializable {
    private Person person;


    /**
     * Méthode qui reçoit la personne à afficher sur la page.
     *
     * @param p La personne à afficher
     * @return "show" si la personne est valide, "error" si le paramètre est
     * null
     */
    public String showPerson(Person p) {
        if (p != null) {
            person = p;
            return "show";
        } else {
            person = null;
            return "error";
        }
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Movie> getPersonMovies() {
        return new ArrayList(person.getMovies().values());
    }

}
