package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.business.Person;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Dyhia.Dib
 */
@Named(value = "movieDetails")
@SessionScoped
public class MoviesDetailsBean implements Serializable {
    private Movie movie;

    /**
     * Get the movie to display
     * @param m The movie to display
     * @return "display" if correct parameter, "error" if null parameter
     */
    public String showMovie(Movie m) {
        if (m == null) {
            return "error";
        } else {
            movie = m;
            return "display";
        }
    }

    /**
     * Get a map of people and convert it to a list of people.
     * @return the list of people who saw the film
     */
    public List<Person> getPersonMovies() {
        return new ArrayList(movie.getPeople().values());
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
