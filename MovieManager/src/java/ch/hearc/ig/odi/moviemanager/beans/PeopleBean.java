package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.services.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Bean lié à la page peopleList.xhtml qui affiche la liste des personnes
 * et de leurs films
 */

@Named(value = "people")
@RequestScoped
public class PeopleBean implements Serializable {
    @Inject Services services;
    
    /**
     * Retourne une liste de personnes
     * @return Une liste de personnes
     */
    @Inject
    public List<Person> getPeopleList(){
        return services.getPeopleList();
    }
    
    @Inject
    public List<Movie> getMoviesList() {
        return services.getMoviesList();
    }
}
