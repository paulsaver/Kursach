import java.util.HashSet;
import java.util.Set;
/**
 * Created by Home on 11.03.2017.
 */
public class Developer {
    private Long id;
    private Long pubId;
    private String name;
    private String surname;
    private String position;
    private Integer efficiency;
    private Set<Game> games = new HashSet();

    public Developer(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPubId() {
        return pubId;
    }

    public void setPubId(long pubId) {
        this.pubId = pubId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public Set getGames() {
        return games;
    }

    public void setGames(Set games) {
        this.games = games;
    }
}