package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.services.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Dyhia.Dib
 */
@Named(value = "movies")
@SessionScoped
public class MoviesBean implements Serializable {

    @Inject
    Services services;

    public List<Movie> getMovies() {
        return services.getMoviesList();
    }

}
