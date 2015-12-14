package ch.hearc.ig.odi.moviemanager.business;

import java.util.HashMap;
import java.util.Map;

public class Person {

    private Long id;
    private String firstName;
    private String lastName;
    private Map<Long, Movie> movies;

    /**
     *
     * Constructeur paramétré pour la classe Person
     *
     * @param id Person number
     * @param firstName Person first name
     * @param lastName Person last name
     */
    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        movies = new HashMap();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<Long, Movie> getMovies() {
        return movies;
    }

    public void setMovies(Map<Long, Movie> movies) {
        this.movies = movies;
    }
    
    public void addMovie(Movie movie) {
        if (!movies.containsKey(movie.getId())) {
            movies.put(movie.getId(), movie);
            movie.getPeople().put(id, this);
        } else {
            System.out.println("ERREUR !!!!!!!!!!!!!!");
        }
        
    }
    

}
