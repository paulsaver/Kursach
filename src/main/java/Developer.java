import java.util.HashSet;
import java.util.Set;
/**
 * Created by Home on 11.03.2017.
 */
public class Developer {
    private long id;
    private long pub_id;
    private String name;
    private String surname;
    private String position;
    private int efficiency;
    private Set<Integer> games = new HashSet();

    public Developer(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPub_id() {
        return pub_id;
    }

    public void setPub_id(long pub_id) {
        this.pub_id = pub_id;
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