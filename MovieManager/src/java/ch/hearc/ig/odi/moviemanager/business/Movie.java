package ch.hearc.ig.odi.moviemanager.business;

import java.util.Map;
import java.util.HashMap;

public class Movie {
    private Long id;
    private String name;
    private String producer;
    private Map<Long, Person> people;
    
    /**
     *
     * Constructeur paramétré pour la classe Movie
     *
     * @param id Movie id
     * @param name Movie name
     * @param producer Movie producer
     */
    public Movie(Long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        people = new HashMap();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Map<Long, Person> getPeople() {
        return people;
    }

    public void setPeople(Map<Long, Person> people) {
        this.people = people;
    }

    
}
