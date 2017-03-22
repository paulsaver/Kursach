package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Home on 11.03.2017.
 */
public class Franchise {
    private Long id;
    private String name;
    private Date date;
    private Publisher pub;
    private Set<Game> games = new HashSet();

    public Franchise(){
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Publisher getPub() {
        return pub;
    }

    public void setPub(Publisher pub) {
        this.pub = pub;
    }

    public Set getGames() {
        return games;
    }

    public void setGames(Set games) {
        this.games = games;
    }
}
